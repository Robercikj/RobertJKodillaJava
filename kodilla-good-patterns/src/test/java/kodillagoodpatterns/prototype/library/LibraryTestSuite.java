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
        Library deepCopyLibrary = library.deepCopy();


        library.getBooks().removeIf(book -> book.getTitle().equals("Kazia"));
        assertEquals(4, library.getBooks().size());
        assertEquals(4, shallowCopiedLibrary.getBooks().size());

        assertEquals(5, deepCopyLibrary.getBooks().size());


    }
}
