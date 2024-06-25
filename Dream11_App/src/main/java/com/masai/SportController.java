package com.masai;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sports")
public class SportController {

    @Autowired
    private SportService sportService;

    @PostMapping("/add")
    public Sport addSport(@RequestBody Sport sport) {
        return sportService.addOrUpdateSport(sport);
    }

    @DeleteMapping("/delete/{sportId}")
    public void deleteSport(@PathVariable Long sportId) {
        sportService.deleteSport(sportId);
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<Sport> findSportByName(@PathVariable String name) {
        Optional<Sport> sport = sportService.findSportByName(name);
        return sport.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

