package main.java;
/**
 * 
 */

/**
 * This class calculates the final grade for CS major.
 * @author Xiaolou Huang
 *
 */
public class AlgorithmCs implements Strategy {
    
    double finalGrade = 0.0;

    @Override
    public double algorithm(
            int finalExamPoints, int assignmentsPoints, int projectPoints, int quizzesPoints) {
        
        // all this is assumed to be something fancy special for this major
        System.out.println("Some other fancy algorithms applies"
                + " for CS students. Grade for this student: ");
        finalGrade = 0.4 * finalExamPoints + 0.25 * assignmentsPoints
                + 0.25 * projectPoints + 0.1 * quizzesPoints;
        
        return finalGrade;
    }

}
