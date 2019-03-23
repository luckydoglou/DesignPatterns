package main.java;

public class Student {
    private String name;
    private Major major;
    private int finalExamPoints;
    private int assignmentsPoints;
    private int projectPoints;
    private int quizzesPoints;
    private double finalGrade;

    // different major will be applied different strategy
    private Strategy algorithmCs;
    private Strategy algorithmSer;
    private Strategy algorithmIt;

    /**
     * Constructor.
     * @param name student name
     * @param major student major
     * @param grades collection of a student grades
     */
    public Student(String name, Major major, int[] grades) {
        this.name = name;
        this.major = major;
        this.finalExamPoints = grades[0];
        this.assignmentsPoints = grades[1];
        this.projectPoints = grades[2];
        this.quizzesPoints = grades[3];

        algorithmCs = new AlgorithmCs(); // CS major
        algorithmSer = new AlgorithmSer(); // SER major
        algorithmIt = new AlgorithmIt(); // IT major
    }

    // assume that the fancy printlns and the line below in here are some calculates
    // or really some fancy algorithms for calculating grades/gpa etc
    /**
     * This method calculates the final grade of the student.
     * @return the finalGrade
     */
    public double calculateFinalGrade() {
        if (major == Major.SER) {
            finalGrade = algorithmSer.algorithm(
                    finalExamPoints, assignmentsPoints, projectPoints, quizzesPoints);
        } else if (major == Major.CS) {
            finalGrade = algorithmCs.algorithm(
                    finalExamPoints, assignmentsPoints, projectPoints, quizzesPoints);
        } else if (major == Major.IT) {
            finalGrade = algorithmIt.algorithm(
                    finalExamPoints, assignmentsPoints, projectPoints, quizzesPoints);
        }
        System.out.println(finalGrade);
        return finalGrade;
    }

}
