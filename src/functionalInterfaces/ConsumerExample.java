package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static void  printName(){
        Consumer<Student> c2 = (s) -> System.out.println(s.toString());
        List<Student> studentList =  StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
    public static void main(String[] args) {
        Consumer<String> c1 = (s -> System.out.println(s.toUpperCase()));
        c1.accept("java8");

        printName();
    }



}
