// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 4 q1
import java.util.ArrayList;
public class Question1 {
    public static void main(String[] args) {
        // Creating a list to store double value
		ArrayList<Double> numbers = new ArrayList<Double>();

        // Adding numbers to the list
        numbers.add(2.2);
        numbers.add(3.3);
        numbers.add(4.4);
        numbers.add(5.5);

        //Inserting 1.1 at the beginning of the list
        numbers.add(0, 1.1);

        //Finding number 5.5 in list
        System.out.println("Index of 5.5 in list is " + numbers.indexOf(5.5));
        
        //Removing 3.3 from list
        numbers.remove(3.3);

        //Removing last number from list
        numbers.remove(numbers.get(numbers.size() - 1));

        //Checking whether number 6.6 is in the list
        System.out.println("The number 6.6 in list: " + numbers.contains(6.6));

        //Retrieve number at index 3 in list
        System.out.println("The number at index 3 of list is " + numbers.get(2));

        //For checking what is in the list at the end of this code's lifetime
        // for (int i = 0; i < numbers.size(); i++)
        //     System.out.println(numbers.get(i));
    }
}
