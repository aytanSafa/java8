package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> function = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(function.apply("ali"));
    }


}
