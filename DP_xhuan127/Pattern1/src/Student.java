
public class Student {
    private String name;
    private Major major;
    private int finalExamPoints;
    private int assignmentsPoints;
    private int projectPoints;
    private int quizzesPoints;
    private double finalGrade;

    public Student(String name, Major major, int[] grades) {
        this.name = name;
        this.major = major;
        this.finalExamPoints = grades[0];
        this.assignmentsPoints = grades[1];
        this.projectPoints = grades[2];
        this.quizzesPoints = grades[3];

    }

    // assume that the fancy printlns and the line below in here are some calculates or really some fancy algorithms for calculating grades/gpa etc 
    public void calculateFinalGrade() {
        System.out.println(name + " is in major " + major);
        if (major == Major.SER) {
            // all this is assumed to be something fancy special for this major
            System.out.println("Some fancy algorithms applies for SER students to calculate their grades. Grade for this student:");
            finalGrade = 0.3 * finalExamPoints + 0.35 * assignmentsPoints + 0.35 * projectPoints;
            System.out.println(finalGrade);
        }
        else if (major == Major.CS) {
         // all this is assumed to be something fancy special for this major
            System.out.println("Some other fancy algorithms applies for CS students. Grade for this student: ");
            finalGrade = 0.4 * finalExamPoints + 0.25 * assignmentsPoints + 0.25 * projectPoints + 0.1 * quizzesPoints;
            System.out.println(finalGrade);
        }
        else if (major == Major.IT) {
         // all this is assumed to be something fancy special for this major
            System.out.println("An even fancier agorithm applies here, since I do not even know if this major exists. Grade for this student:\"");
            finalGrade = 0.8 * finalExamPoints +  0.2 * projectPoints;
            System.out.println(finalGrade);
        }

    }





}
