package cz.vojtechkubat.ChuckNorrisJokeGenerator.controllers;

import cz.vojtechkubat.ChuckNorrisJokeGenerator.services.CNJokeService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class JokeController {

    private CNJokeService cnJokeService;

    public JokeController(CNJokeService cnJokeService) {
        this.cnJokeService = cnJokeService;
    }

    @RequestMapping("/")
    String home() {
        return this.cnJokeService.getRandomJoke();
    }

}
