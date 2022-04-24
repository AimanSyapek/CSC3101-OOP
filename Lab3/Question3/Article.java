// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Article extends Publication{
    private String journalName;
    private int pageNumStart;
    private int pageNumEnd;
    private int volume;

    public Article(String authorName, String title, int year, String journalName, int volume, int pageNumStart, int pageNumEnd) {
		super(authorName, title, year);
		this.journalName = journalName;
		this.volume = volume;
		this.pageNumStart = pageNumStart;
		this.pageNumEnd = pageNumEnd;
	}
    
    public String toString() {
		return super.toString()+"Journal name : " + journalName + " \nVolume : " + volume + "\nFrom page " + pageNumStart + " until page " + pageNumEnd + "\n";
	}
}
