package com.project.Pcforge.Lemas.Controller;

import com.project.Pcforge.Lemas.Entity.Slogan;
import com.project.Pcforge.Lemas.Repository.SloganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/slogans")
public class SloganController {

    @Autowired
    private SloganRepository sloganRepository;

    @GetMapping("/random")
    public Slogan getRandomSlogan() {
        List<Slogan> slogans = sloganRepository.findAll();
        if (slogans.isEmpty()) {
            return null;
        }
        int randomIndex = new Random().nextInt(slogans.size());
        return slogans.get(randomIndex);
    }
}
