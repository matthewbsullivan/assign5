package assign5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Implements Iterator for the contents of Student so that no changes need to
 * be made to Student class
 * @author Matt Sullivan
 * @author Luis Rocha
 */
public class StudentIterator implements Iterator<Double> {
    private ArrayList<Double> scores  // scores for the assignments
            = new ArrayList<Double>();

    public StudentIterator(Student s){
        //Sums up the number of grades to be used by the upcmming for loop.
        int total_grades = s.getNumberOfAssignments()+s.getNumberOfExams();

        //Loops for the total number of grades.
        for(int i= 0; i < total_grades; i++){
            int number = 0;// Used to track the index for getExamScore. Instead of restarting the i int over.
            if(i<s.getNumberOfAssignments()){
                //adds all the assignments to the scores arraylist.
                scores.add(s.getAssignmentScore(i));
            }
            else {
                //adds all the exams to the scores arraylist.
                scores.add(s.getExamScore(number));//works when this is
            }
        }
    }

    private int i = 0;

    @Override
    public boolean hasNext() {
        return i < scores.size() && scores.get(i) != null;
    }

    @Override
    public Double next() {
        return scores.get(i++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
