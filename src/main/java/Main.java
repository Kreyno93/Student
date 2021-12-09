import model.StudentDB;
import model.University;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



        StudentDB student1 = new StudentDB("Timo", true, 2.3, 0);
        StudentDB student2 = new StudentDB("Alex", true, 2.7, 1);
        StudentDB student3 = new StudentDB("Günther", false, 1.7, 2);
        StudentDB student4 = new StudentDB("Max", false, 3.7, 3);
        StudentDB student5 = new StudentDB("Selin", false, 3.3, 4);

        Map<Integer, StudentDB> studentMap = new HashMap<>();

        studentMap.put(0,student1);
        studentMap.put(1,student2);
        studentMap.put(2,student3);

        StudentDB newStudent = new StudentDB("Waldemar", true, 4.7, 6);
        StudentDB newStudent2 = new StudentDB("Dominic", true, 4.3, 7);
        StudentDB newStudent3 = new StudentDB("Heinz", true, 3.7, 8);


        University University = new University("Lordran");
        University Uni = new University("DeineMudda",studentMap);

        University.addStudentHashMap(newStudent);
        University.addStudentHashMap(newStudent2);
        University.addStudentHashMap(newStudent3);
        Uni.addStudentHashMap(student4);
        System.out.println("Neue Map : "+studentMap);
//        System.out.println(University.toString());c

    }


}
