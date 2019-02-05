package greenfoxinharitanceexercise;

import java.util.ArrayList;
import java.util.List;

public class Chort {
    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public Chort(String name){
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }
    public void addStudent(Student diak){
        students.add(diak);
    }
    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }
    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

}
