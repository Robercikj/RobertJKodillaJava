package kodillagoodpatterns.flight;


import java.util.Arrays;
import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        List<Flight> flights = Arrays.asList(
                new Flight("Gdańsk", "Wrocław"),
                new Flight("Gdańsk", "Kraków"),
                new Flight("Kraków", "Wrocław"),
                new Flight("Warszawa", "Gdańsk"),
                new Flight("Wrocław", "Warszawa")
        );
        FlightService flightService = new FlightService(flights);
        System.out.println("\nz Gdańska");
        flightService.getFlightsFrom("Gdańsk").forEach(System.out::println);

        System.out.println("\nDo Warszawy");
        flightService.getFlightsTo("Warszawa").forEach(System.out::println);


        System.out.println("\nPołączenie lotówdsdfdfsd ");
        flightService.findConnectingFlights("Gdańsk", "Kraków", "Wrocław")
                .forEach(connection -> System.out.println(connection.getArrivalCity() + "->" + connection.getDepartureCity()));
    }

}
