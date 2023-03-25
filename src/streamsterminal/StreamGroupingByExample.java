package streamsterminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class StreamGroupingByExample {


    public static  Map<String, List<Student>>   groupStudentsByGender(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
    }

    public static  Map<String, List<Student>>   customizeGroupingBy(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }


    public static Map<Integer,Map<String,List<Student>>> twoLevelGrouping_1(){
       return StudentDataBase.getAllStudents()
                .stream().collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
    }

    public static Map<Integer,Integer> twoLevelGrouping_2(){
        return StudentDataBase.getAllStudents()
                .stream().collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNoteBooks)));
    }

    public static void main(String[] args) {
        System.out.println(groupStudentsByGender());
        System.out.println(customizeGroupingBy());
        System.out.println(twoLevelGrouping_1());
        System.out.println(twoLevelGrouping_2());
    }
}
