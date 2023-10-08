package cz.vojtechkubat.ChuckNorrisJokeGenerator.controllers;

import cz.vojtechkubat.ChuckNorrisJokeGenerator.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

//    public JokeController(@Qualifier("jokeAlternativeService") JokeService jokeService) {
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

//    @RequestMapping("/")
//    public String home() {
//        return this.jokeService.getRandomJoke();
//    }

    @RequestMapping({"/", ""})
    String showJoke(Model model) {
        model.addAttribute("joke", this.jokeService.getRandomJoke());
        return "index";
    }
}
