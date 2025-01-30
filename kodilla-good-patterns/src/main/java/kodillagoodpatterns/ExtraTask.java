package kodillagoodpatterns;

public class ExtraTask {

    int[] numbers = {3, 1, 5, 6, 7, 9, 15, 3, 4, 7, 10};

    

    public int findMinimal(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < minNumber){
                minNumber= array[i];
            }

        }
        return minNumber;
    }
    public int findMaximal(int[] array) {
        int maxNumber= array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxNumber){
                maxNumber= array[i];
            }
        }
            return maxNumber;
    }

    public static void main(String[] args) {
        ExtraTask task = new ExtraTask();
        int minNumber = task.findMinimal(task.numbers);
        int maxNumber = task.findMaximal(task.numbers);
        System.out.println("minimal number: "+ minNumber);
        System.out.println("Maximal number:  "+ maxNumber);
    }

}
