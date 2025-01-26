package kodillagoodpatterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LibraryTestSuite {
    @Test
    void testGetBooks() throws CloneNotSupportedException {

        Library library = new Library("First library");


        library.getBooks().add(new Book("Wikitoria", "WIktoria", LocalDate.of(2000, 10, 10)));
        library.getBooks().add(new Book("Marlena", "Wexle", LocalDate.of(2025, 10, 10)));
        library.getBooks().add(new Book("Robert", "Wexle", LocalDate.of(2005, 10, 10)));
        library.getBooks().add(new Book("Klaudia", "Marionetka", LocalDate.of(2010, 10, 10)));
        library.getBooks().add(new Book("Kazia", "WIktoria", LocalDate.of(2020, 10, 10)));



        Library shallowCopiedLibrary = library.shallowCopy();
        Library deepCopiedLibrary = library.deepCopy();


        Library clonedLibrary = library.shallowCopy();
        clonedLibrary.getBooks().add(new Book("Extra Book", "Extra Author", LocalDate.of(2022, 1, 1)));

        Library deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.getBooks().add(new Book("Another Extra Book", "Another Author", LocalDate.of(2023, 2, 2)));

        System.out.println("Shallow sizez" + shallowCopiedLibrary.getBooks().size());
        System.out.println("Deep sizez" + deepCopiedLibrary.getBooks().size());
    }
}
