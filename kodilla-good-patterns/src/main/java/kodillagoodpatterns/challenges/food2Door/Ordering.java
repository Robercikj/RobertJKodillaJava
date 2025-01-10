package kodillagoodpatterns.challenges.food2Door;

public class Ordering {
    public void processingOrder(Producer producer, String product, int quantity, Unit unit){
        boolean isProcessing = producer.process(product, quantity, unit);

        if(isProcessing){
            System.out.println("Order processed successfully");
        }else {
            System.out.println("Order processing failed");
        }
    }
}
