
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class GradedActivity {
    private double score; //Variable for keeping score

    public void setScore(double score){ //set score from argument
      this.score = score;
    }

    public double getScore(){ //get score
      return score;
    }


    public char getGrade(){ //determines the grade's score field, returns a char
      char grade;   // To hold the grade

      if (score >= 90)
         grade = 'A';
      else if (score >= 80)
         grade = 'B';
      else if (score >= 70)
         grade = 'C';
      else if (score >= 60)
         grade = 'D';
      else
         grade = 'F';

      return grade;
    }
}
