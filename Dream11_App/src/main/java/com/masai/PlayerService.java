package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player addOrUpdatePlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Long playerId) {
        playerRepository.deleteById(playerId);
    }

    public List<Player> findPlayersByName(String name) {
        return playerRepository.findByName(name);
    }

    public List<Player> findPlayersByTeam(Team team) {
        return playerRepository.findByTeam(team);
    }
}

