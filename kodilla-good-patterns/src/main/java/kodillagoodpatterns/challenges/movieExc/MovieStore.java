package kodillagoodpatterns.challenges.movieExc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {
    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");
        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avenue");
        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");
        Map<String, List<String>> bookTitlesWithTranslations = new HashMap<>();
        bookTitlesWithTranslations.put("IM", ironManTranslations);
        bookTitlesWithTranslations.put("AV", avengersTranslations);
        bookTitlesWithTranslations.put("FL", flashTranslations);
        return bookTitlesWithTranslations;

    }
}