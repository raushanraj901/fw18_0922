package com.masai;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team addOrUpdateTeam(Team team) {
        return teamRepository.save(team);
    }

    public void deleteTeam(Long teamId) {
        teamRepository.deleteById(teamId);
    }

    public Optional<Team> findTeamByName(String name) {
        return teamRepository.findByName(name);
    }
}
