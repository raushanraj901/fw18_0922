package com.masai;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SportService {

    @Autowired
    private SportRepository sportRepository;

    public Sport addOrUpdateSport(Sport sport) {
        return sportRepository.save(sport);
    }

    public void deleteSport(Long sportId) {
        sportRepository.deleteById(sportId);
    }

    public Optional<Sport> findSportByName(String name) {
        return sportRepository.findByName(name);
    }
}

