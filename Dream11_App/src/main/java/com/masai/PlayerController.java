package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addOrUpdatePlayer(player);
    }

    @DeleteMapping("/delete/{playerId}")
    public void deletePlayer(@PathVariable Long playerId) {
        playerService.deletePlayer(playerId);
    }

    @GetMapping("/findByName/{name}")
    public List<Player> findPlayersByName(@PathVariable String name) {
        return playerService.findPlayersByName(name);
    }

    @GetMapping("/findByTeam/{teamId}")
    public List<Player> findPlayersByTeam(@PathVariable Long teamId) {
        Team team = new Team();
        team.setTeamId(teamId); // Assuming Team entity has a setId method
        return playerService.findPlayersByTeam(team);
    }
}

