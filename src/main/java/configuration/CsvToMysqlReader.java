package configuration;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * This class is used to read the CSV file and load the data into the MySQL database.
 */
@Component
public class CsvToMysqlReader {

    @PostConstruct
    public void loadCsvData() {
        String csvFile = "/Users/Tola/Downloads/players_server_app.csv";
        String jdbcUrl = "jdbc:mysql://localhost:3306/playerDB";
        String jdbcUser = "root";
        String jdbcPassword = "pass";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
            CSVReader csvReader = new CSVReaderBuilder(new FileReader(csvFile)).withSkipLines(1).build();

            String[] record;
            String insertQuery = "INSERT INTO player " +
                    "(ranking, season_id, tournament_id, tournament_region_id, tournament_region_code, region_code, tournament_name, tournament_short_name, " +
                    "first_name, last_name, player_id, is_active, is_opta, team_id, team_name, played_positions, age, height, weight, position_text, apps, " +
                    "sub_on, mins_played, rating, goal, assist_total, yellow_card, red_card, shots_per_game, aerial_won_per_game, man_of_the_match, " +
                    "name, is_man_of_the_match, played_positions_short, pass_success) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            while ((record = csvReader.readNext()) != null) {
                Long playerId = Long.parseLong(record[10]);
                if (isRecordExists(playerId, connection)) {
                    continue;
                }

                for (int i = 0; i < record.length; i++) {
                    String value = record[i];
                    if ("TRUE".equals(value) || "FALSE".equals(value)) {
                        preparedStatement.setInt(i + 1, "TRUE".equals(value) ? 1 : 0);
                    } else {
                        preparedStatement.setString(i + 1, value);
                    }
                }
                preparedStatement.execute();
            }

            connection.close();
            csvReader.close();
        } catch (IOException | SQLException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

    private static boolean isRecordExists(Long playerId, Connection connection) throws SQLException {
        String query = "SELECT COUNT(*) FROM player WHERE player_id = ?";
        PreparedStatement checkStatement = connection.prepareStatement(query);
        checkStatement.setLong(1, playerId);
        ResultSet resultSet = checkStatement.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            return count > 0;
        }

        return false;
    }
}
