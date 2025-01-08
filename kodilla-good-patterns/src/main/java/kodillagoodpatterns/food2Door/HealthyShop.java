package kodillagoodpatterns.food2Door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(String product, int quantity, Unit unit){
        System.out.println("In progress .. ( Healthy shop" + quantity + unit.getSymbol());
        return true;
    }
}
