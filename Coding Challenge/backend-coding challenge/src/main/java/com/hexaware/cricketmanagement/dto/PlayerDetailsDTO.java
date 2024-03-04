package com.hexaware.cricketmanagement.dto;

public class PlayerDetailsDTO {
	private long playerId;
	private String playerName;
	private long jerseyNumber;
	private String role;
	private int totalMatches;
	private String teamName;
	private String country;
	private String description;
	
	public PlayerDetailsDTO() {
		super();
		
	}

	public PlayerDetailsDTO(long playerId, String playerName, long jerseyNumber, String role, int totalMatches,
			String teamName, String country, String description) {
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
		return "PlayerDetailsDTO [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber="
				+ jerseyNumber + ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName
				+ ", country=" + country + ", description=" + description + "]";
	}
	
	

}
