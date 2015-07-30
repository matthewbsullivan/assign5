package assign5;

import java.util.ArrayList;

/**
 * Represents a student and their scores in a class.
 * Stores the name, assignment scores and exam scores.
 * @author Jill Seaman
 *
 */
public class Student extends Observable {

    private String name;                   // Students full name
    private ArrayList<Double> assignments  // scores for the assignments
            = new ArrayList<Double>();
    private ArrayList<Double> exams        // scores for the exams
            = new ArrayList<Double>();

    /**
     * Constructs the student from their name
     * @param name  full name of the student.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * @return the student's full name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds an assignment score to the collection of assignment scores for the student.
     * @param as the assignment score to add
     */
    public void addAssignmentScore (double as) {
        assignments.add(as);
    }
    /**
     * Adds an exam score to the collection of exam scores for the student.
     * @param es the exam score to add
     */
    public void addExamScore (double es) {
        exams.add(es);
    }

    /**
     * @return the average for the student
     */
    public double getAverage(int selection) {
        // implement me!
        double assignSum = 0.0,
                examSum = 0.0;
        //get the average of assignments
        for (int i = 0; i < assignments.size(); i++){
            assignSum += assignments.get(i);
        }
        //get the average of exams
        for (int i = 0; i < exams.size(); i++){
            examSum += exams.get(i);
        }

        double lowest;
        //find lowest assignment grade
        if (getNumberOfExams()>=2){
                lowest = assignments.get(0);
                for (int i = 0; i < assignments.size(); i++){
                    if(assignments.get(i)<lowest)
                        lowest = assignments.get(i);
                }
            }
        lowest = -1.0;

        //call grading interface and get algorithm-determined GPA
        GradingAlgorithm ga;
        GradingSwitch s = new GradingSwitch();
        ga = s.chooseAlgorithm(selection);
        return ga.getAverage(assignSum, getNumberOfAssignments(), examSum,
                getNumberOfExams(), lowest);
    }

    /**
     * @return the number of assignments in the list
     */
    public int getNumberOfAssignments() {
        return assignments.size();
    }

    /**
     * @param i the index of the assignment to return
     * @return the assignment at position i
     */
    public Double getAssignmentScore(int i) {
        return assignments.get(i);
    }

    /**
     * @return the number of exams in the list
     */
    public int getNumberOfExams() {
        return exams.size();
    }

    /**
     * @param i the index of the exam to return
     * @return the exam at position i
     */
    public Double getExamScore(int i) {
        return exams.get(i);
    }
}