package cz.vojtechkubat.ChuckNorrisJokeGenerator.services;

import org.springframework.stereotype.Service;

@Service()
public class JokeAlternativeService implements JokeService {
    @Override
    public String getRandomJoke() {
        return "My alternative implementation";
    }
}
