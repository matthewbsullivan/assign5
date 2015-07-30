package assign5;

/**
 * Created by Windozer on 7/29/2015.
 */
public class GradingStandard implements GradingAlgorithm {
    @Override
    public double getAverage(double aSum, int aNum, double eSum, int eNum,
                             double low){
        return .40*(aSum/aNum)+.60*(eSum/eNum);
    }
}
