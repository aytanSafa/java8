package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {
    private static int noOfNoteBooks(){
       return StudentDataBase.getAllStudents().stream()
               .filter(student -> student.getGradeLevel() >= 3)
               .map(Student::getNoteBooks)
               //.reduce(0,(a,b) -> a+b)
               .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
