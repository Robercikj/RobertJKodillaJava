package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {

    @Test
    public void shouldReturnPeopleQauntity(){
        //given
        Country poland = new Country(new BigDecimal(3900000), "Poland");
        Country germany = new Country(new BigDecimal(4900000), "Germany");
        List<Country> europeCoutries = List.of(poland, germany);
        Continent europe = new Continent(europeCoutries);
        Country egypt = new Country( new BigDecimal("59000000"),"Egypt");
        Country kenya = new Country( new BigDecimal("49000000"),"Kenya");
        List<Country> africaCountries = List.of(egypt, kenya);
        Continent africa = new Continent(africaCountries);
        List<Continent> continents = List.of(europe, africa);
        World world = new World(continents);


        // when
        BigDecimal result = world.getPeopleQuantity();



        //then

        assertEquals(new BigDecimal("19600000"), result);

    }

}