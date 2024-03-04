package com.hexaware.cricketmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketmanagement.dto.PlayerDetailsDTO;
import com.hexaware.cricketmanagement.entity.PlayerDetails;
import com.hexaware.cricketmanagement.service.IPlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	IPlayerService playerService;
	
	@PostMapping("/add")
	public PlayerDetails createPlayer(@RequestBody PlayerDetailsDTO playerDTO) {
		return playerService.createPlayer(playerDTO);
	}
	
	@PutMapping("/update/{id}")
	public PlayerDetails updatePlayer(@PathVariable Long id, @RequestBody PlayerDetailsDTO playerDTO)
	{
		return playerService.updatePlayer(id, playerDTO);
	}
	
	@GetMapping("/get/{id}")
	public PlayerDetailsDTO getPlayerById(@PathVariable Long id)
	{
		return playerService.getPlayerById(id);
	}
	
	@GetMapping("/getall")
	public List<PlayerDetails> getAllPlayers(){
		return playerService.getAllPlayers();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePlayer(@PathVariable Long id) {
		playerService.deletePlayer(id);
	}
	@GetMapping("/getallwithteamnames")
    public List<Object[]> getAllPlayersWithTeamNames() {
        return playerService.getAllPlayersWithTeamNames();
    }
}
