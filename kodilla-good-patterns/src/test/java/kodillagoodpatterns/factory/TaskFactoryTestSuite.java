package kodillagoodpatterns.factory;

import kodillagoodpatterns.factory.tasks.ShoppingTask;
import kodillagoodpatterns.factory.tasks.Task;
import kodillagoodpatterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    @DisplayName("Shopping")
    void shoppingTaskTest() {
        TaskFactory factory = new TaskFactory();
        Task shoppingTask = factory.createTask("SHOPPING");

        assert shoppingTask != null;
        assertEquals("Shopping", shoppingTask.getTaskName(), "task name - Shopping");


        shoppingTask.executeTask();
        assertTrue(shoppingTask.isTaskExecuted(), "predicting - true");


    }
    @Test
    @DisplayName("Driving")
    void DrivingTaskTest() {
        TaskFactory factory = new TaskFactory();
        Task drivingTask = factory.createTask("DRIVING");

        assert drivingTask != null;
        assertEquals("Driving", drivingTask.getTaskName(), "task name - Driving");


        drivingTask.executeTask();
        assertTrue(drivingTask.isTaskExecuted(), "predicting - true");
    }
    @Test
    @DisplayName("Painting")
    void PaintingTaskTest() {
        TaskFactory factory = new TaskFactory();
        Task paintingTask = factory.createTask("PAINTING");

        assert paintingTask != null;
        assertEquals("Painting", paintingTask.getTaskName(), "task name - Painting");


        paintingTask.executeTask();
        assertTrue(paintingTask.isTaskExecuted(), "predicting - true");
    }
    @Test
    @DisplayName("General Test")
    void GeneralTaskTest() {
        TaskFactory factory = new TaskFactory();
        Task generalTask = factory.createTask("SHOPPING");
        Task generalTask1 = factory.createTask("DRIVING");
        Task generalTask2 = factory.createTask("PAINTING");

        assert generalTask != null;
        assertEquals("Shopping", generalTask.getTaskName(), "task name - Shopping");
        generalTask.executeTask();
        assertTrue(generalTask.isTaskExecuted(), "predicting - true");
        assertEquals("Driving", generalTask1.getTaskName(), "task name - Driving");
        generalTask1.executeTask();
        assertTrue(generalTask1.isTaskExecuted(), "predicting - true");
        assertEquals("Painting", generalTask2.getTaskName(), "task name - Painting");
        generalTask2.executeTask();
        assertTrue(generalTask2.isTaskExecuted(), "predicting - true");
    }
    @Test
    @DisplayName("SingleFiledTest")
    void SingleFiledTaskTest() {
        TaskFactory factory = new TaskFactory();
        Task singleFieldTask = factory.createTask("SHOPPING");

        assertNotNull(singleFieldTask, "predicting - not null");

        assertEquals("Shopping", singleFieldTask.getTaskName(), "wrong task name - Shopping");
        assertEquals("Car", ((ShoppingTask) singleFieldTask).getWhatToBuy(), "wrong item");
        assertEquals(1.0, ((ShoppingTask) singleFieldTask).getQuantity(), "wrong quantity");
    }
}
