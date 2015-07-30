package assign5;

/**
 * Created by Windozer on 7/29/2015.
 */
public class GradingSwitch {
    public GradingAlgorithm chooseAlgorithm(int selection) {
        GradingAlgorithm ga;
        switch (selection){
            case 1: return ga = new GradingStandard();
            case 2: return ga = new GradingDropLowest();
            default: System.out.println("selection was something other than 1" +
                    " or 2, no grading algorithm selected");
        }
        return null;
    }
}
