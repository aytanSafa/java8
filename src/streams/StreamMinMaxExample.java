package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMinMaxExample {

    public static int findMaxValue( List<Integer>  integerList){
        return integerList.stream()
                .reduce(0,(a,b) -> a > b ? a : b);
    }

    public static int findMinValue( List<Integer>  integerList){
        return integerList.stream()
                .reduce((a,b) -> a < b ? a : b).get();
    }


    public static void main(String[] args) {
        List<Integer>  integerList = Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(integerList));
        System.out.println(findMinValue(integerList));
    }


}
