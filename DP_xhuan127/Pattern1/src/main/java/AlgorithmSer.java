package main.java;
/**
 * 
 */

/**
 * This class calculates the final grade for SER major.
 * @author Xiaolou Huang
 *
 */
public class AlgorithmSer implements Strategy {

    double finalGrade;

    @Override
    public double algorithm(
            int finalExamPoints, int assignmentsPoints, int projectPoints, int quizzesPoints) {

        // all this is assumed to be something fancy special for this major
        System.out.println("Some fancy algorithms applies for SER students"
                + " to calculate their grades. Grade for this student:");
        finalGrade = 0.3 * finalExamPoints + 0.35 * assignmentsPoints + 0.35 * projectPoints;

        return finalGrade;
    }

}
