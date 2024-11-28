package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String name;
    private BigDecimal population;

    public Country(BigDecimal population, String name) {
        this.population = population;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity(){
        return population;
    }
}
