package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
       Student student = StudentDataBase.studentSupplier.get();
        if (student != null ){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStundentNameOptional(){

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }

        return Optional.empty();
    }
    public static void main(String[] args) {

        Optional<String> stringOptional = getStundentNameOptional();
        if (stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }
    }
}
