
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Essay extends GradedActivity {
    private final int grammarPossible = 30;
    private final int spellingPossible = 20;
    private final int lengthPossible = 20;
    private final int contentPossible = 30;

    private int grammarGrade;
    private int spellingGrade;
    private int lengthGrade;
    private int contentGrade;
    private int overallGrade;

    public Essay(int grammar, int spelling, int length, int content){
        setGrammarGrade(grammar);
        setSpellingGrade(spelling);
        setLengthGrade(length);
        setContentGrade(content);
        setOverallGrade();
        setScore(getOverallGrade());  // inherited method

    }

    public int getGrammarGrade(){
        return grammarGrade;
    }

    public void setGrammarGrade(int grammarGrade){
        if (grammarGrade <= grammarPossible) //check if below possible value, then only set value
            this.grammarGrade = grammarGrade;
    }

    public int getSpellingGrade(){
        return spellingGrade;
    }

    public void setSpellingGrade(int spellingGrade){ 
        if (spellingGrade <= spellingPossible) //check if below possible value, then only set value
            this.spellingGrade = spellingGrade;
    }

    public int getLengthGrade(){
        return lengthGrade;
    }

    public void setLengthGrade(int lengthGrade){
        if(lengthGrade <= lengthPossible) //check if below possible value, then only set value
            this.lengthGrade = lengthGrade;
    }

    public int getContentGrade(){
        return contentGrade;
    }

    public void setContentGrade(int contentGrade){
        if(contentGrade <= contentPossible) //check if below possible value, then only set value
            this.contentGrade = contentGrade;
    }

    public int getOverallGrade(){
        return overallGrade;
    }

    public void setOverallGrade(){
        int grades = grammarGrade + spellingGrade + lengthGrade + contentGrade;
        this.overallGrade = grades;
    }

    public int getGrammarPossible(){
        return grammarPossible;
    }

    public int getSpellingPossible(){
        return spellingPossible;
    }

    public int getLengthPossible(){
        return lengthPossible;
    }

    public int getContentPossible(){
        return contentPossible;
    }

}
