
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 1 Question 1

import java.util.Scanner;

public class Lab1Q3_210564 {
    public static void main(String[] args) { //a test program
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] anArray = new double[row][column]; // create array based on user input

        System.out.println("Enter the element of the array: ");
        //for loops for input for each cells
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                anArray[i][j] = input.nextDouble();
            }
        }
        Location anArrayLocation = Location.locateLargest(anArray); //call method from class to locate largest in user created array
        System.out.println("The location of the largest element is "+ anArrayLocation.maxValue+ " at ("+ anArrayLocation.row+','+ anArrayLocation.column+')');
    }
}

