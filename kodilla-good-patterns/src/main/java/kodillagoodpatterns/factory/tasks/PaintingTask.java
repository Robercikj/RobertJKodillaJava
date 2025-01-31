package kodillagoodpatterns.factory.tasks;

public class PaintingTask implements Task{
    private boolean isExecuted = false;
    private final String taskName;
    private final String color;
    private final String whatToPaint;

   public PaintingTask(String taskName, String color, String whatToPaint){
       this.taskName = taskName;
       this.color = color;
       this.whatToPaint = whatToPaint;
   }

    @Override
    public String executeTask() {
       isExecuted = true;
        return taskName + " " + color + " " + whatToPaint;
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
