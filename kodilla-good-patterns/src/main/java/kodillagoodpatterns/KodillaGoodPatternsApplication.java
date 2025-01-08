package kodillagoodpatterns;

import kodillagoodpatterns.challenges.movieExc.Calculator;
import kodillagoodpatterns.challenges.movieExc.MovieStore;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.stream.Collectors;




@SpringBootApplication
public class KodillaGoodPatternsApplication {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String MovieResult = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(", "));
        System.out.println(MovieResult);

        System.out.println("Obliczanie silni z liczbą na wejściu: ");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int number = scanner.nextInt();

        try{
            long CalculationResult = calculator.calcExtraTask(number);
            calculator.calcExtraTask(number);
            System.out.println("Silnia liczby" + number + "wynosi: " + CalculationResult );
        } catch (Exception e) {
            throw new RuntimeException("Błąd " + e.getMessage());
        }



    }



}


