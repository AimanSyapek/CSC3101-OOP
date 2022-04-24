// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Publication {
    private String authorName;
    private String title;
    private int year;

    public Publication(String name, String title, int year) {
		this.authorName = name;
		this.title = title;
		this.year = year;
	}

    public String toString(){
        return "Author name : " + authorName + "\nTitle : " + title + "\nYear : " + year + "\n";
    }
}
