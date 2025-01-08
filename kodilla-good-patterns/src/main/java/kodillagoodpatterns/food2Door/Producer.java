package kodillagoodpatterns.food2Door;

public interface Producer {

    boolean process(String product, int quantity, Unit unit);
}
