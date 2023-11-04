package controller.dto;

import lombok.Data;

/**
 * This class is a DTO for Player List Data (less detailed data)
 */
@Data
public class PlayerListDTO {

    private String name;
    private String firstName;
    private String lastName;
    private String teamName;
    private int age;
    private int height;
    private int weight;
    private String playedPositions;

    public PlayerListDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    public String getPlayedPositions() {
        return playedPositions;
    }

    public void setPlayedPositions(String playedPositions) {
        this.playedPositions = playedPositions;
    }
}
