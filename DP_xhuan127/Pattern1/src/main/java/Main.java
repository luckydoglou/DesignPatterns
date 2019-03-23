package main.java;

public class Main {

    /**
     * Main class.
     * @param args input
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // lets create some grades
        int[] grades = {90,80,70,90};
        
        Student s1 = new Student("Lea", Major.CS, grades);
        Student s2 = new Student("Astrid", Major.SER, grades);
        Student s3 = new Student("Gisela", Major.IT, grades);
        
        s1.calculateFinalGrade();
        s2.calculateFinalGrade();
        s3.calculateFinalGrade();
    }

}
