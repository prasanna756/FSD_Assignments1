package com.hexaware.cricketmanagement.exception;

public class PlayerNotFoundException extends RuntimeException {
	public PlayerNotFoundException(Long id) {
        super("Player not found with id : " + id);
    }

}
