// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Book extends Publication{
    private String edition;
	private String publisher;

	public Book(String name, String title, int year, String edition, String publisher) {
		super(name, title, year);
		this.edition = edition;
		this.publisher = publisher;
	}

	public String toString() {
		return super.toString()+"Book Edition : " + edition + "\nPublisher : " + publisher + "\n";
	}
}
