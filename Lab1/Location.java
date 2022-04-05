// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 1 Question 3

public class Location {
   int row;
   int column;
   double maxValue;

   Location(int newRow, int newColumn, double newMaxValue){
       row = newRow;
       column = newColumn;
       maxValue = newMaxValue;
   }

   public static Location locateLargest (double[][] currentArray){
        int row = 0;
        int column = 0;
        double maxValue = currentArray[row][column];
        
        for(int i = 0; i < currentArray.length; i++){
            for(int j = 0; j < currentArray[i].length; j++){
                if (maxValue < currentArray[i][j]){
                    maxValue = currentArray[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        
        return new Location(row, column, maxValue);
   }
}
