package com.hexaware.cricketmanagement.service;

import java.util.List;

import com.hexaware.cricketmanagement.dto.PlayerDetailsDTO;
import com.hexaware.cricketmanagement.entity.PlayerDetails;
import com.hexaware.cricketmanagement.exception.PlayerNotFoundException;

public interface IPlayerService {
	 
   public PlayerDetails createPlayer(PlayerDetailsDTO playerDTO);
   
   public PlayerDetails updatePlayer(Long id, PlayerDetailsDTO playerDTO);
   
   public PlayerDetailsDTO getPlayerById(Long id) throws PlayerNotFoundException;
	
   public List<PlayerDetails> getAllPlayers();

   public void deletePlayer(Long id);

 
   public List<Object[]> getAllPlayersWithTeamNames();

   

}
