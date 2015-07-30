package assign5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Windozer on 7/29/2015.
 */
public class StudentIterator implements Iterator<Double> {
    private ArrayList<Double> scores  // scores for the assignments
            = new ArrayList<Double>();

    public StudentIterator(Student s){
        for(int i=0; i < s.getNumberOfAssignments()+s.getNumberOfExams();
            i++){
            if(i<s.getNumberOfAssignments()){
                this.scores.add(i, s.getAssignmentScore(i));
            }
            else this.scores.add(i, s.getExamScore(i));//works when this is
            // commented out
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
