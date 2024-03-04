package com.hexaware.cricketmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class PlayerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long playerId;

	@NotBlank(message = "Player name is required")
	private String playerName;

	@Min(value = 1, message = "Jersey number must be atleat 1")
	private long jerseyNumber;

	@NotBlank(message = "Please specify the role")
	private String role;

	private int totalMatches;

	@NotBlank(message = "Team name is required")
	private String teamName;

	private String country;

	private String description;

	public PlayerDetails() {
		super();

	}

	public PlayerDetails(long playerId, @NotBlank(message = "Player name is required") String playerName,
			@Min(value = 1, message = "Jersey number must be atleat 1") long jerseyNumber,
			@NotBlank(message = "Please specify the role") String role, int totalMatches,
			@NotBlank(message = "Team name is required") String teamName, String country, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.description = description;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public long getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(long jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PlayerDetails [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", description=" + description + "]";
	}

}
