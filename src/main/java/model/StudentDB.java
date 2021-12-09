package model;

public class StudentDB {

    String name;
    boolean isRP;
    double grades;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentDB(String name, boolean isRP, double grades, int id) {
        this.name = name;
        this.isRP = isRP;
        this.grades = grades;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isRP=" + isRP +
                ", grades=" + grades +
                ", id=" + id +
                '}'+"\n";
    }

    public double getGrades() {
        return grades;
    }
}
