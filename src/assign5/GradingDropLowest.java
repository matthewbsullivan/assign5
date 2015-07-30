package assign5;

/**
 * Implements GradingAlgorithm to create a grading algorithm that uses the
 * standard weighting, but drops the lowest assignment grade.
 * @author Matt Sullivan
 * @author Luis Rocha
 */
public class GradingDropLowest implements GradingAlgorithm {
    @Override
    public double getAverage(double aSum, int aNum, double eSum, int eNum,
                             double low){
        if (low!=-1.0){
            aSum = aSum - low;
            aNum -=1;
        }
        return .40*(aSum/aNum)+.60*(eSum/eNum);
    }
}
