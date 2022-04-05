package Lab2;
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 2

import java.util.Scanner; 

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //for user input
        Circle[] circleArray = new Circle[3]; //create 3 object in array form not intantiate yet
        for(int i=0; i<3; i++){
            circleArray[i] = new Circle(); //intantiate corresponding class
            System.out.print("Enter a radius for a circle: "); //ask input
            circleArray[i].setRadius(scanner.nextInt());
            Circle.printCircle(circleArray[i]); //print
        }
        scanner.close();

        // Circle.setRadius(20); - Question 2
        // Circle.printCircle(Circle); - Question 3
    }
}
