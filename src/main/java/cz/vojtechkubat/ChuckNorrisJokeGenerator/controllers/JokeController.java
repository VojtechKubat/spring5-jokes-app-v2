package cz.vojtechkubat.ChuckNorrisJokeGenerator.controllers;

import cz.vojtechkubat.ChuckNorrisJokeGenerator.services.JokeService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    String home() {
        return this.jokeService.getRandomJoke();
    }

}
