package assign5;

/**
 * Implements GradingAlgorithm to create a grading algorithm that uses the
 * standard weighting.
 * @author Matt Sullivan
 * @author Luis Rocha
 */
public class GradingStandard implements GradingAlgorithm {
    @Override
    public double getAverage(double aSum, int aNum, double eSum, int eNum,
                             double low){
        return .40*(aSum/aNum)+.60*(eSum/eNum);
    }
}
