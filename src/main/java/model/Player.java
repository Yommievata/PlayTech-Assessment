package model;

import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serializable;

@Entity
@Table(name = "player")
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id", nullable = false, unique = true, updatable = false)
    private Long playerId;
    @Column(name = "ranking")
    private Long ranking;
    @Column(name = "season_id")
    private Long seasonId;
    @Column(name = "tournament_id")
    private Long tournamentId;
    @Column(name = "tournament_region_id")
    private Long tournamentRegionId;
    @Column(name = "tournament_region_code")
    private String tournamentRegionCode;
    @Column(name = "region_code")
    private String regionCode;
    @Column(name = "tournament_name")
    private String tournamentName;
    @Column(name = "tournament_short_name")
    private String tournamentShortName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "is_opta")
    private boolean isOpta;
    @Column(name = "team_id")
    private Long teamId;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "played_positions")
    private String playedPositions;
    @Column(name = "age")
    private int age;
    @Column(name = "height")
    private int height;
    @Column(name = "weight")
    private int weight;
    @Column(name = "position_text")
    private String positionText;
    @Column(name = "apps")
    private int apps;
    @Column(name = "sub_on")
    private int subOn;
    @Column(name = "mins_played")
    private int minsPlayed;
    @Column(name = "rating")
    private double rating;
    @Column(name = "goal")
    private int goal;
    @Column(name = "assist_total")
    private int assistTotal;
    @Column(name = "yellow_card")
    private int yellowCard;
    @Column(name = "red_card")
    private int redCard;
    @Column(name = "shots_per_game")
    private double shotsPerGame;
    @Column(name = "aerial_won_per_game")
    private double aerialWonPerGame;
    @Column(name = "man_of_the_match")
    private int manOfTheMatch;
    @Column(name = "name")
    private String name;
    @Column(name = "is_man_of_the_match")
    private boolean isManOfTheMatch;
    @Column(name = "played_positions_short")
    private String playedPositionsShort;
    @Column(name = "pass_success")
    private double passSuccess;

    public Player() {
    }

    public Long getRanking() {
        return ranking;
    }

    public void setRanking(Long ranking) {
        this.ranking = ranking;
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Long getTournamentRegionId() {
        return tournamentRegionId;
    }

    public void setTournamentRegionId(Long tournamentRegionId) {
        this.tournamentRegionId = tournamentRegionId;
    }

    public String getTournamentRegionCode() {
        return tournamentRegionCode;
    }

    public void setTournamentRegionCode(String tournamentRegionCode) {
        this.tournamentRegionCode = tournamentRegionCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getTournamentShortName() {
        return tournamentShortName;
    }

    public void setTournamentShortName(String tournamentShortName) {
        this.tournamentShortName = tournamentShortName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isOpta() {
        return isOpta;
    }

    public void setOpta(boolean opta) {
        isOpta = opta;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayedPositions() {
        return playedPositions;
    }

    public void setPlayedPositions(String playedPositions) {
        this.playedPositions = playedPositions;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPositionText() {
        return positionText;
    }

    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    public int getApps() {
        return apps;
    }

    public void setApps(int apps) {
        this.apps = apps;
    }

    public int getSubOn() {
        return subOn;
    }

    public void setSubOn(int subOn) {
        this.subOn = subOn;
    }

    public int getMinsPlayed() {
        return minsPlayed;
    }

    public void setMinsPlayed(int minsPlayed) {
        this.minsPlayed = minsPlayed;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getAssistTotal() {
        return assistTotal;
    }

    public void setAssistTotal(int assistTotal) {
        this.assistTotal = assistTotal;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    public double getShotsPerGame() {
        return shotsPerGame;
    }

    public void setShotsPerGame(double shotsPerGame) {
        this.shotsPerGame = shotsPerGame;
    }

    public double getAerialWonPerGame() {
        return aerialWonPerGame;
    }

    public void setAerialWonPerGame(double aerialWonPerGame) {
        this.aerialWonPerGame = aerialWonPerGame;
    }

    public int getManOfTheMatch() {
        return manOfTheMatch;
    }

    public void setManOfTheMatch(int manOfTheMatch) {
        this.manOfTheMatch = manOfTheMatch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isManOfTheMatch() {
        return isManOfTheMatch;
    }

    public void setManOfTheMatch(boolean manOfTheMatch) {
        isManOfTheMatch = manOfTheMatch;
    }

    public String getPlayedPositionsShort() {
        return playedPositionsShort;
    }

    public void setPlayedPositionsShort(String playedPositionsShort) {
        this.playedPositionsShort = playedPositionsShort;
    }

    public double getPassSuccess() {
        return passSuccess;
    }

    public void setPassSuccess(double passSuccess) {
        this.passSuccess = passSuccess;
    }
}

