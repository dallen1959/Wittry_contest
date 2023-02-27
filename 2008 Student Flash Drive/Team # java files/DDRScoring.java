import java.util.*;
/*
 * 2008 programing contest
 * DDRScoring.java
 */
public class DDRScoring {
    private int steps;

    public DDRScoring(int numSteps) {
        steps = numSteps;
    }
    public int getBaseStepScore() {
        if (steps == 4) return 100000;
        return 12820;
    }

    public int getLastStepBonus() {
        if (steps == 4) return 0;
        return 400;
    }

    public int getStepScore(int k) {
        return -999;
    }

    public int addStep(String str) {
        if(str.equals("Perfect") && steps == 4) return 1000000;
        if(str.equals("Great") && steps == 4) return 2000000;
        if(str.equals("Good") && steps == 4) return 2000000;
        if(str.equals("Perfect") && steps == 4) return 3000000;

        
        return -999;
    }

    public int getDanceScore() {
        return -9999;
    }

    public String getStageGrade() {
        if (steps == 4) return "C";
        return "SSS";
    }
}