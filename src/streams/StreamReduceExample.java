package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {


    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }


    public static Optional<Student> getHighestGPAStudent(){
       return StudentDataBase.getAllStudents().stream()
                .reduce((a,b) -> a.getGpa() > b.getGpa() ? a : b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);

        System.out.println(performMultiplication(integerList));
        System.out.println(performMultiplicationWithoutIdentity(integerList).get());
        System.out.println(getHighestGPAStudent().get());
    }



}
