package streams;

import data.StudentDataBase;

public class StreamsMatchExample {


    // Return true if all students greaterThan or equal to 3.9
    public  static  boolean allMatch(){
       return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() >= 3.9);
    }

    //Return true if only one elements greaterThan or equal to 4.0
    public  static  boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }


    // Opposite the allMatch()
    public  static  boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa() >= 4.1);
    }


    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
        System.out.println(noneMatch());
    }



}
