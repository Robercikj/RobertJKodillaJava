package kodillagoodpatterns.factory.tasks;

public class DrivingTask implements Task{
    private boolean isExecuted = false;
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return taskName + " " + where + " " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted ;
    }
}
