package numericstreams;

import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is : " + sum);
        System.out.println("Max is : " + IntStream.rangeClosed(1,50).max().getAsInt());
        System.out.println("Min is : " + IntStream.rangeClosed(1,50).min().getAsInt());
        System.out.println("Average is : " + IntStream.rangeClosed(1,50).average().getAsDouble());
    }


}
