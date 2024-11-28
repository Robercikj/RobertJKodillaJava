package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }
    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }

    @Override
    public String toString() {
        return "World{" +
                "continents=" + continents +
                '}';
    }
    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
