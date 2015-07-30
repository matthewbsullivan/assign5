package assign5;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {

    public static void uiMethod (Iterator<Double> i) {
        DecimalFormat df = new DecimalFormat("0.0");
        while (i.hasNext()) {
            System.out.println(df.format(i.next()));
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Harry Potter");
        student.addAssignmentScore(98.5);
        student.addAssignmentScore(90.1);
        student.addAssignmentScore(78.3);
        student.addExamScore(95);
        student.addExamScore(87);

        DecimalFormat df = new DecimalFormat("0.0");

        Scanner s = new Scanner(System.in);
        System.out.println("Choose the number of the grading method desired:");
        System.out.println("1. Class Average= .40*(Assignment Average) + .60*" +
                "(Exam Average");
        System.out.println("2. Same weighting as 1 but drop lowest Assignment" +
                        " score.");
        int input = s.nextInt();
        switch (input){
            // should use algorithm A by default:
            case 1: System.out.println(student.getName() + "  " +
                    df.format(student.getAverage(input)));
                break;
            // switch to algorithm B:
            // <<code to switch to B goes here>>
            case 2: System.out.println(student.getName() + "  " +
                    df.format(student.getAverage(input)));
                break;
        }


        //test the StudentIterator using uiMethod
        // <<create an instance to pass to the uiMethod>>
        StudentIterator studIt = new StudentIterator(student);
        Iterator<Double> si = studIt;
        uiMethod(si);

        //test the GradeTracker
        GradeTracker gt = new GradeTracker(student);
        System.out.println("letter grade: " + gt.getLetterGrade());
        student.addExamScore(33);
        System.out.println("Added an exam score.");
        System.out.println("letter grade: " + gt.getLetterGrade());

    }
}