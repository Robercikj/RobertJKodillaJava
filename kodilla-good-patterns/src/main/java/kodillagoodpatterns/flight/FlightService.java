package kodillagoodpatterns.flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private final List<Flight> flights;

    public FlightService(List<Flight> flights) {
        this.flights = flights;
    }
    public List<Flight> getFlightsFrom(String City) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equalsIgnoreCase(City))
                .collect(Collectors.toList());
    }
    public List<Flight> getFlightsTo(String city) {
        return flights.stream()
                .filter(flight -> flight.getArrivalCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findConnectingFlights(String from, String through, String to) {
        List<Flight> firstLeg = getFlightsFrom(from).stream()
                .filter(flight -> flight.getArrivalCity().equalsIgnoreCase(through))
                .collect(Collectors.toList());

        List<Flight> secondLeg = getFlightsFrom(through).stream()
                .filter(flight -> flight.getArrivalCity().equalsIgnoreCase(to))
                .collect(Collectors.toList());

        return firstLeg.stream()
                .flatMap(f1 ->secondLeg.stream()
                        .map(f2->List.of(f1,f2)))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }


}
