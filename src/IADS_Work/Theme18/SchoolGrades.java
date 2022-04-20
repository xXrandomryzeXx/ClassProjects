package IADS_Work.Theme18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args){
        HashMap<Integer, HashMap<String, ArrayList<Double>>> grades = new HashMap<>();
        /*AddStudent(1, grades);
        AddStudent(2, grades);
        AddStudent(3, grades);

        AddSubject(1, "Math", grades);
        AddSubject(2, "Math", grades);
        AddSubject(3, "Math", grades);

        AddGrade(1, "Math", 5.5, grades);
        AddGrade(2, "Math", 6.0, grades);
        AddGrade(3, "Math", 5.0, grades);*/

        Scanner input = new Scanner(System.in);
        String command = "";
        do{
            System.out.println("1. Add students");
            System.out.println("2. Add subjects");
            System.out.println("3. Add grades");
            System.out.println("   Type exit to exit.");
            command = input.nextLine();

            try{
                int choice = Integer.parseInt(command);
                if(choice == 1){
                    EnterStudents(grades);
                }else if(choice == 2){
                    grades.forEach((key, value)->{
                        System.out.println(key);
                    });
                    System.out.print("Choose a student, to add subjects to: ");
                    int student = Integer.parseInt(input.nextLine());
                    EnterSubjects(student, grades);

                }else if(choice == 3){
                    grades.forEach((key, value)->{
                        System.out.println(key);
                    });
                    System.out.print("Choose a student, to add grades to: ");
                    int student = Integer.parseInt(input.nextLine());

                    grades.get(student).forEach((key, value)->{
                        System.out.println(key);
                    });
                    System.out.print("Choose a subject, to add grades to: ");
                    String subject = input.nextLine();
                    EnterGrades(student, subject, grades);
                }
            }catch(NumberFormatException e){
                if(!command.equals("exit")) System.out.println("ERROR: Input was not an Integer");
            }

        }while(!command.equals("exit"));

        // Printing the whole HashMap of grades
        for(int key : grades.keySet()){
            double gradesSum = 0;
            int numberOfGrades = 0;

            System.out.println(key + ": ");

            for(String subject : grades.get(key).keySet()){
                System.out.print(subject + ": ");
                for(double grade : grades.get(key).get(subject)){
                    System.out.print(grade + " ");
                    gradesSum += grade;
                    numberOfGrades++;
                }
                System.out.println();
            }
            System.out.println("Student average: " + (gradesSum/numberOfGrades));
        }
    }


    public static void AddStudent(int student, HashMap<Integer, HashMap<String, ArrayList<Double>>> grades){
        if(!grades.containsKey(student)) // Avoid adding an element with the same name
            grades.put(student, new HashMap<>());
        else if(grades.containsKey(student))
            System.out.println("ERROR: The ID is already taken!");


    }
    public static void AddSubject(int student, String subject, HashMap<Integer, HashMap<String, ArrayList<Double>>> grades){
        if(grades.containsKey(student) && !grades.get(student).containsKey(subject))
            grades.get(student).put(subject, new ArrayList<>());
        else if (grades.containsKey(student) && grades.get(student).containsKey(subject))
            System.out.println("ERROR: The subject already exists");
    }
    public static void AddGrade(int student, String subject, Double grade, HashMap<Integer, HashMap<String, ArrayList<Double>>> grades){
        if(grades.containsKey(student) && grades.get(student).containsKey(subject))
            grades.get(student).get(subject).add(grade);
        else if(!grades.containsKey(student))
            System.out.println("This student does not exist");
        else if(grades.containsKey(student) && !grades.get(student).containsKey(subject))
            System.out.println("This student does not have such a subject");
    }

    public static void EnterStudents(HashMap<Integer, HashMap<String, ArrayList<Double>>> grades){
        Scanner input = new Scanner(System.in);
        String comm = "";
        do{
            System.out.print("Enter a student ID to add, or enter nothing to exit this menu: ");
            comm = input.nextLine();
            if(!comm.equals("")) AddStudent(Integer.parseInt(comm), grades);
        }while(!comm.equals(""));
    }
    public static void EnterSubjects(int student, HashMap<Integer, HashMap<String, ArrayList<Double>>> grades){
        Scanner input = new Scanner(System.in);
        String command = "";
        do{
            System.out.print("Enter a subject to add to " + student + ", or enter nothing to exit this menu: ");
            command = input.nextLine();
            if(!command.equals("")) AddSubject(student, command, grades);
        }while(!command.equals(""));
    }
    public static void EnterGrades(int student, String subject, HashMap<Integer, HashMap<String, ArrayList<Double>>> grades){
        Scanner input = new Scanner(System.in);
        String command = "";
        do{
            System.out.print("Enter a grade to add to " + subject + ", or enter nothing to exit this menu: ");
            command = input.nextLine();
            if(!command.equals("")) AddGrade(student, subject, Double.parseDouble(command), grades);
        }while(!command.equals(""));
    }

}