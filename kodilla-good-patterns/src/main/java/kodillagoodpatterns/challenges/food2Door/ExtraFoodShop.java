package kodillagoodpatterns.challenges.food2Door;

public class ExtraFoodShop implements Producer{
    @Override
    public boolean process(String product, int quantity, Unit unit) {
        System.out.println("In progress ..  (Extra Food Shop)" + quantity + unit.getSymbol());
        return true;
    }
}
