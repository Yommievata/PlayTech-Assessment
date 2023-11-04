package controller.dto;

import lombok.Data;

/**
 * This class is a DTO for Player Detail Data
 */
@Data
public class PlayerDTO {

    private Long playerId;
    private Long ranking;
    private Long seasonId;
    private Long tournamentId;
    private Long tournamentRegionId;
    private String tournamentRegionCode;
    private String regionCode;
    private String tournamentName;
    private String tournamentShortName;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private boolean isOpta;
    private Long teamId;
    private String teamName;
    private String playedPositions;
    private int age;
    private int height;
    private int weight;
    private String positionText;
    private int apps;
    private int subOn;
    private int minsPlayed;
    private double rating;
    private int goal;
    private int assistTotal;
    private int yellowCard;
    private int redCard;
    private double shotsPerGame;
    private double aerialWonPerGame;
    private int manOfTheMatch;
    private String name;
    private boolean isManOfTheMatch;
    private String playedPositionsShort;
    private double passSuccess;

    public PlayerDTO() {
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
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

