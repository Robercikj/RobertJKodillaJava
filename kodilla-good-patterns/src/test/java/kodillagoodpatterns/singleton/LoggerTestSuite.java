package kodillagoodpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    @Test
    void logTest() {

        Logger logger = Logger.INSTANCE;
        logger.log("first Log message");

        String lastLog = logger.getLastLog();
        assertEquals("first Log message", lastLog);
    }

    @Test
    void logTest2() {
        //given
        Logger logger1 = Logger.INSTANCE;
        Logger logger2 = Logger.INSTANCE;
        //when
        logger1.log(" second log message");
        String log2 = logger2.getLastLog();
        //then

        assertEquals(" second log message", logger2.getLastLog());
        assertEquals(logger1, logger2);


    }
}
