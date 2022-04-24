
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a program that determines a student essays grade.");
        System.out.print("""
            Please enter Students mark for their eassay in the respective category; 
            Grammar(30), Spelling(20), Correct Length(20), Content(30)
            the maximum points a students each category is denoted next to it in the line above.
            Enter points:
            """);

            int grammarPoints = sc.nextInt();
            int spellingPoints = sc.nextInt();
            int lengthPoints = sc.nextInt();
            int contentPoints = sc.nextInt();

            Essay essay = new Essay(grammarPoints, spellingPoints, lengthPoints, contentPoints); // Creating an object of a class.
            GradedActivity superClass = essay; // Creating a variable of type superclass(GradedActivity) that hold a reference to a subclass object (essay).
            System.out.println("Calculating...\n");
            System.out.println("Total score: "+superClass.getScore()+" %\nGrade: "+superClass.getGrade());

    }
}
