package kodillagoodpatterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sEASAM")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients(Arrays.asList("Lettuce", "Bacon", "Onion"))
                .build();


        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        List<String> ingredients = bigmac.getIngredients();

        assertEquals("sEASAM", bun);
        assertEquals(2, burgers);
        assertEquals("Barbecue", sauce);
        assertTrue(ingredients.contains("Bacon"));
        assertTrue(ingredients.contains("Onion"));
    }
}
