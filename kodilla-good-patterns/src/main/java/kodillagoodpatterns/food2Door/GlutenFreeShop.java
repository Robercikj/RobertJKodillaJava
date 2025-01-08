package kodillagoodpatterns.food2Door;

public class GlutenFreeShop implements Producer{
    @Override
    public boolean process(String product, int quantity, Unit unit){
        System.out.println("In progress .. (Gluten Free Shop)" + quantity + unit.getSymbol());
        return true;
    }
}
