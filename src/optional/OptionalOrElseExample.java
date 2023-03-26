package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //OrElse
    //OrElseGet
    //OrElseThrow

    public static String optionalOrElse(){

       //Optional<Student> studentOptional =
         //      Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> studentOptional =
                Optional.ofNullable(null);

        return studentOptional.map(Student::getName).orElse("Default");
    }

    public static String optionalOrElseGet(){
/*
        Optional<Student> studentOptional =
              Optional.ofNullable(StudentDataBase.studentSupplier.get());
*/
        Optional<Student> studentOptional =
                Optional.ofNullable(null);

        return studentOptional.map(Student::getName).orElseGet(() -> "Default");
    }

    public static String optionalOrElseThrow(){
        /*
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
*/
        Optional<Student> studentOptional =
                Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available"));
        return name;
    }


    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }

}
