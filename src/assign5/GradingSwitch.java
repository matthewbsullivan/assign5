package assign5;

/**
 * GradingSwitch determines which grading algorithm is appropriate
 * @author Matt Sullivan
 * @author Luis Rocha
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
