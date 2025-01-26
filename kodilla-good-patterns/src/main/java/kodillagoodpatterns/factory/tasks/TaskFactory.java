package kodillagoodpatterns.factory.tasks;



public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String Task) {
        return switch (Task) {
            case DRIVING -> new DrivingTask("Driving", "Gdańsk", "by car");
            case PAINTING -> new PaintingTask("Painting", "BLACK", "Cat");
            case SHOPPING -> new ShoppingTask("Shopping", "Car", 1.0);
            default -> null;
        };
    }
}
