package kodillagoodpatterns.challenges;

public class Calculator {

    public long calcExtraTask(int n ) {
        if( n < 0) {
            throw new IllegalArgumentException("nie ujemne liczby tylko");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
return factorial;
    }


}
