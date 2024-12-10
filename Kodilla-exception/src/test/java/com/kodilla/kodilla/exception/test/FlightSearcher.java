package com.kodilla.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Berlin", true);
        airports.put("London", false);

        String arrivalAirport = flight.getArrivalAirport();

        if (!airports.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Route to " + arrivalAirport + " not found!");
        }

        return airports.get(arrivalAirport);
    }
}

