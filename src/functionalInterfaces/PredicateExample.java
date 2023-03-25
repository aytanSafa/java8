package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = integer -> integer % 2 ==0;
    static Predicate<Integer> p2 = integer -> integer % 2 ==0;
    static Predicate<Integer> p3 = integer -> integer % 5 == 0;

    public static void  predicateAnd(){
        System.out.println(p2.and(p3).test(9));
    }
    public static void  predicateOr(){
        System.out.println(p2.or(p3).test(8));
    }
    public static void  predicateNegate(){
        System.out.println(p2.or(p3).negate().test(8));
    }
    public static void main(String[] args) {
        System.out.println(p.test(5));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
