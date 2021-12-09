package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class University {

    String uniName;
    int hashSize=0;
    Map<Integer, StudentDB> studentMap = new HashMap<>();

    public University(String uniName, Map<Integer, StudentDB> studentMap) {
        this.uniName = uniName;
        this.studentMap = studentMap;
        this.hashSize = studentMap.size();
    }

    public University(String uniName) {
        this.uniName = uniName;
    }

    public int getStudentCountHashMap(){
        return studentMap.size();
    }

    public void addStudentHashMap(StudentDB newStudent) {
        studentMap.put(hashSize, newStudent);
        newStudent.setId(hashSize);
        hashSize++;
    }

    @Override
    public String toString() {
        return "University{" +
                "uniName='" + uniName + '\''+"\n"+ studentMap + '}'+"\n";
    }
}
