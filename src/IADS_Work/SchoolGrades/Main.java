/* Current file: Main.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.SchoolGrades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String command = "";

        ArrayList<Student> studentsDiary = new ArrayList<>();
        Student a = new Student("John", "Smith");
        Student b = new Student("Smith", "Johnson");
        studentsDiary.add(a);
        studentsDiary.add(b);
        addSubject(studentsDiary, "Math");
        addSubject(studentsDiary, "English");
        addSubject(studentsDiary, "Physics");
        a.addGrade("Math", 5.5);
        a.addGrade("English", 5);
        a.addGrade("Physics", 6);

        b.addGrade("Math", 6);
        b.addGrade("English", 4);
        b.addGrade("Physics", 5);


        enum Menu{
            MAIN,
            EDIT,
            ADD_STUDENT,
            ADD_SUBJECT,
            REMOVE_STUDENT,
            REMOVE_SUBJECT,
            DISPLAY_DIARY,
            EXIT
        }
        Menu currentMenu = Menu.MAIN;

        //Main menu
        do {
            switch(currentMenu){
                case MAIN:
                    System.out.println("1. Edit Diary");
                    System.out.println("2. Display Diary");
                    System.out.println("3. Exit");

                    command = input.nextLine();

                    switch(Integer.parseInt(command)){
                        case 1:
                            currentMenu = Menu.EDIT;
                            break;
                            case 2:
                                currentMenu = Menu.DISPLAY_DIARY;
                                break;
                            case 3:
                                currentMenu = Menu.EXIT;
                                break;
                    }

                    break;

                case EDIT:

                    break;

                case ADD_STUDENT:

                    break;

                case ADD_SUBJECT:

                    break;

                case REMOVE_STUDENT:

                    break;

                case REMOVE_SUBJECT:

                    break;

                case DISPLAY_DIARY:
                    currentMenu = Menu.MAIN;
                    break;
            }
        }while(currentMenu != Menu.EXIT);
    }

    // Student class has a method that will add a subject to the student, but not to everyone else
    // hence why this method is needed, when making a diary.
    // NOTE: Additional checks should be added if students are to be separated by grade
    // Example: Mike->grade 1 has some classes different from John->grade 2 etc.
    public static void addSubject(ArrayList<Student> diary, String subject){
        for(Student student : diary){
            student.addSubject(subject);
        }
    }
    // Same principle as addSubject
    public static void removeSubject(ArrayList<Student> diary, String subject){
        for(Student student : diary){
            student.removeSubject(subject);
        }
    }

    public static String generateString(String str, int n){
        String string = "";
        for(int i = 0; i < n; i++){
            string += str;
        }
        return string;
    }
}
