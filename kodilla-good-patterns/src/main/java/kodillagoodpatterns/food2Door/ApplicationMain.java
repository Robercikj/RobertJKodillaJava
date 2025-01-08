package kodillagoodpatterns.food2Door;

public class ApplicationMain {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        Ordering ordering = new Ordering();

        extraFoodShop.process("Panga", 100, Unit.KILOGRAMS);
        glutenFreeShop.process("milk glutenfree", 100, Unit.LITERS);
        healthyShop.process("Carrot", 100, Unit.KILOGRAMS);

    }
}
