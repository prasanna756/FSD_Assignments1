package com.hexaware.cricketmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cricketmanagement.entity.PlayerDetails;

@Repository
public interface PlayerDetailsRepository extends JpaRepository<PlayerDetails, Long> {
    @Query("SELECT p FROM PlayerDetails p ORDER BY p.totalMatches ASC")
    List<PlayerDetails> findAllSortedByMatchesAsc();
    
    @Query("SELECT p.playerName, p.teamName FROM PlayerDetails p")
    List<Object[]> findAllPlayersWithTeamNames();
    
}
