package assign5;

/**
 * Created by Windozer on 7/29/2015.
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
