package cz.vojtechkubat.ChuckNorrisJokeGenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service("CNJokeService")
public class CNJokeServiceImpl implements CNJokeService {
    private static ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }
}
