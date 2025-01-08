package kodillagoodpatterns.food2Door;

public enum Unit {
    KILOGRAMS("kg"),
    LITERS("liters"),
    PIECES("pcs");

    private final String symbol;

    Unit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
