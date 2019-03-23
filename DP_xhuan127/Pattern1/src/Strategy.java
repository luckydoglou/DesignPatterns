/**
 * This interface class calculates the final grade of students.
 * @author Xiaolou Huang
 *
 */
public interface Strategy {

    double algorithm(
            int finalExamPoints, int assignmentsPoints, int projectPoints, int quizzesPoints);
    
}
