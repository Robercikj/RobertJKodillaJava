package com.kodilla.kodilla.exception.test;

import com.kodilla.kodilla.exception.main.Flight;
import com.kodilla.kodilla.exception.main.FlightSearcher;
import com.kodilla.kodilla.exception.main.RouteNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) {
    FlightSearcher searcher = new FlightSearcher();
    Flight flight = new Flight("Warsaw", "Paris");

    try {
        boolean canFly = searcher.findFlight(flight);
        System.out.println("Flight to " + flight.getArrivalAirport() + " is " + (canFly ? "available" : "not available"));
    } catch (RouteNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
    }

    Flight anotherFlight = new Flight("Berlin", "London"); // lot do Londynu
        try {
        boolean canFly = searcher.findFlight(anotherFlight);
        System.out.println("Flight to " + anotherFlight.getArrivalAirport() + " is " + (canFly ? "available" : "not available"));
    } catch (RouteNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
