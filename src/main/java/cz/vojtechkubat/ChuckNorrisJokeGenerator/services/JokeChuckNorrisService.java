package cz.vojtechkubat.ChuckNorrisJokeGenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service()
public class JokeChuckNorrisService implements JokeService {
    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }
}
