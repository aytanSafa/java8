package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {


    public static int sumOfNNumbers(){
        return IntStream.rangeClosed(1,6) //
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNumbers());
    }


}
