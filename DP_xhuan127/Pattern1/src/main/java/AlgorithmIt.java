package main.java;
/**
 * 
 */

/**
 * This class calculates the final grade for IT major.
 * @author Xiaolou Huang
 *
 */
public class AlgorithmIt implements Strategy {

    double finalGrade = 0.0;
    
    @Override
    public double algorithm(
            int finalExamPoints, int assignmentsPoints, int projectPoints, int quizzesPoints) {
        
        // all this is assumed to be something fancy special for this major
        System.out.println(
                "An even fancier agorithm applies here, since I do"
                + " not even know if this major exists. Grade for this student:\"");
        finalGrade = 0.8 * finalExamPoints + 0.2 * projectPoints;
        
        return finalGrade;
    }

}
