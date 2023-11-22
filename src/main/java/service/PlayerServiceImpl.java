package service;

import controller.dto.PlayerDTO;
import controller.dto.PlayerListDTO;
import javassist.NotFoundException;
import model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAllPlayers() throws NotFoundException {
            List<Player> players = playerRepository.findAll();
            if (players.isEmpty())
                throw new NotFoundException("No players found");
            else
                return players;
    }

    public Player getPlayerById(Long id) throws NotFoundException {
        Player player = playerRepository.findById(id).orElse(null);
        if (player == null) {
            throw new NotFoundException("Player with id " + id + " not found");
        }
        return player;
    }

    /**
     * Map a Player object to a PlayerDTO object (Detailed Data).
     *
     * @param player The Player object to map.
     * @return The PlayerDTO object.
     */
    public PlayerDTO mapPlayerToDto(Player player) {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setPlayerId(player.getPlayerId());
        playerDTO.setRanking(player.getRanking());
        playerDTO.setSeasonId(player.getSeasonId());
        playerDTO.setTournamentId(player.getTournamentId());
        playerDTO.setTournamentRegionId(player.getTournamentRegionId());
        playerDTO.setTournamentRegionCode(player.getTournamentRegionCode());
        playerDTO.setRegionCode(player.getRegionCode());
        playerDTO.setTournamentName(player.getTournamentName());
        playerDTO.setTournamentShortName(player.getTournamentShortName());
        playerDTO.setFirstName(player.getFirstName());
        playerDTO.setLastName(player.getLastName());
        playerDTO.setActive(player.isActive());
        playerDTO.setOpta(player.isOpta());
        playerDTO.setTeamId(player.getTeamId());
        playerDTO.setTeamName(player.getTeamName());
        playerDTO.setPlayedPositions(player.getPlayedPositions());
        playerDTO.setAge(player.getAge());
        playerDTO.setHeight(player.getHeight());
        playerDTO.setWeight(player.getWeight());
        playerDTO.setPositionText(player.getPositionText());
        playerDTO.setApps(player.getApps());
        playerDTO.setSubOn(player.getSubOn());
        playerDTO.setMinsPlayed(player.getMinsPlayed());
        playerDTO.setRating(player.getRating());
        playerDTO.setGoal(player.getGoal());
        playerDTO.setAssistTotal(player.getAssistTotal());
        playerDTO.setYellowCard(player.getYellowCard());
        playerDTO.setRedCard(player.getRedCard());
        playerDTO.setShotsPerGame(player.getShotsPerGame());
        playerDTO.setAerialWonPerGame(player.getAerialWonPerGame());
        playerDTO.setManOfTheMatch(player.getManOfTheMatch());
        playerDTO.setName(player.getName());
        playerDTO.setManOfTheMatch(player.getManOfTheMatch());
        playerDTO.setPlayedPositionsShort(player.getPlayedPositionsShort());
        playerDTO.setPassSuccess(player.getPassSuccess());
        return playerDTO;
    }

    /**
     * Map a Player object to a PlayerListDTO object (Basic Data).
     *
     * @param player The Player object to map.
     * @return The PlayerListDTO object.
     */
    public PlayerListDTO mapPlayerListToDto(Player player) {
        PlayerListDTO playerListDTO = new PlayerListDTO();
        playerListDTO.setName(player.getName());
        playerListDTO.setFirstName(player.getFirstName());
        playerListDTO.setLastName(player.getLastName());
        playerListDTO.setTeamName(player.getTeamName());
        playerListDTO.setAge(player.getAge());
        playerListDTO.setHeight(player.getHeight());
        playerListDTO.setWeight(player.getWeight());
        playerListDTO.setPlayedPositions(player.getPlayedPositions());
        return playerListDTO;
    }
}
