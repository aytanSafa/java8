package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = System.out::println;


    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
    }


}
