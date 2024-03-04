package com.hexaware.cricketmanagement.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketmanagement.dto.PlayerDetailsDTO;
import com.hexaware.cricketmanagement.entity.PlayerDetails;
import com.hexaware.cricketmanagement.exception.PlayerNotFoundException;
import com.hexaware.cricketmanagement.repository.PlayerDetailsRepository;


@Service
public class PlayerDetailsServiceImp implements IPlayerService {
	
	Logger logger=LoggerFactory.getLogger(PlayerDetailsServiceImp.class);

	@Autowired
	PlayerDetailsRepository playerRepo;

	@Override
	public PlayerDetails createPlayer(PlayerDetailsDTO playerDTO) {
		logger.info("creating new player: {}",playerDTO);
		PlayerDetails player = new PlayerDetails();
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountry(playerDTO.getCountry());
		player.setDescription(playerDTO.getDescription());

		return playerRepo.save(player);
	}

	@Override
	public PlayerDetails updatePlayer(Long id, PlayerDetailsDTO playerDTO) {
		PlayerDetails player = playerRepo.findById(id).orElse(null);
		if (player != null) {
			player.setPlayerName(playerDTO.getPlayerName());
			player.setJerseyNumber(playerDTO.getJerseyNumber());
			player.setRole(playerDTO.getRole());
			player.setTotalMatches(playerDTO.getTotalMatches());
			player.setTeamName(playerDTO.getTeamName());
			player.setCountry(playerDTO.getCountry());
			player.setDescription(playerDTO.getDescription());
			
			logger.info("Player updated successfully: {}");

			return playerRepo.save(player);

		} else {
			logger.error("Player with ID {} not found",id);

			return null;
		}
	}

	@Override
	public PlayerDetailsDTO getPlayerById(Long id) {
		 logger.info("Fetching player with id: {}", id);
		PlayerDetails player = playerRepo.findById(id)
                             .orElseThrow(() -> 
                             new PlayerNotFoundException(id));

		PlayerDetailsDTO dto = new PlayerDetailsDTO();
		dto.setPlayerName(player.getPlayerName());
		dto.setJerseyNumber(player.getJerseyNumber());
		dto.setRole(player.getRole());
		dto.setTotalMatches(player.getTotalMatches());
		dto.setTeamName(player.getTeamName());
		dto.setCountry(player.getCountry());
		dto.setDescription(player.getDescription());

		return dto;
	}

	@Override
	public List<PlayerDetails> getAllPlayers() {
		logger.info("Fetching all players");
		return playerRepo.findAll();
	}

	@Override
	public void deletePlayer(Long id) {
		playerRepo.deleteById(id);

	}
	@Override
    public List<Object[]> getAllPlayersWithTeamNames() {
        return playerRepo.findAllPlayersWithTeamNames();
    }
    }


