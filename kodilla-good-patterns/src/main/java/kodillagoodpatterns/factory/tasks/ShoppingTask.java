package kodillagoodpatterns.factory.tasks;

public class ShoppingTask implements Task{
    private boolean isExecuted = false;
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public String executeTask() {
        isExecuted = true;
        return taskName + " " + whatToBuy + " " + quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
