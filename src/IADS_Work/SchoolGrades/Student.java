/* Current file: Student.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.SchoolGrades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String first_name = "";
    private String last_name = "";
    private long student_id = 0;

    // HashMap<Subject, Grades>
    private HashMap<String, ArrayList<Double>> grades = new HashMap<>();

    Student(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        student_id = generateId();
    }

    //Adds a subject to the grades list
    public void addSubject(String subject){
        if(!grades.containsKey(subject)){
            grades.put(subject, new ArrayList<>());
        }
    }

    // Adds a grade to a subject, if it's available
    public void addGrade(String subject, double grade){
        if(grades.containsKey(subject)){
            grades.get(subject).add(grade);
        }
    }

    // Removes a subject from the grades list
    public void removeSubject(String subject){
        grades.remove(subject);
    }

    // Removes a grade from the grades of a subject
    public void removeGrade(String subject, double grade){
        grades.get(subject).remove(grade);
    }

    // Returns all subjects that the student has grades for
    public ArrayList<String> getSubjects(){
        return new ArrayList<>(grades.keySet());
    }
    // Returns an list of all grades for the given subject

    public ArrayList<Double> getGrades(String subject){
        return grades.get(subject);
    }

    // Returns the first name of the student
    public String getFirstName(){
        return first_name;
    }
    // Returns the last name of the student
    public String getLastName(){
        return last_name;
    }
    // Returns the ID of the student
    public long getStudentId(){
        return student_id;
    }

    // Generates a custom ID for a student
    // It could be made to generate one using date of creation of the student file
    // and birthday
    private long generateId(){
        long id = 0;
        for(char c : first_name.toCharArray()){
            id += c + 1257;
        }
        for(char c : last_name.toCharArray()){
            id += (long) c * c;
        }
        return id;
    }
}
