
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class TechReport extends Publication{
	private String address; //address or institution of the author
	private int reportNum;

	public TechReport(String name, String title, int year, String address, int reportNum) {
		super(name, title, year);
		this.address = address;
		this.reportNum = reportNum;
	}

	public String toString() {
		return super.toString()+"Address of the Author : " + address + "\nTech report amount : " + reportNum + "\n";
	}
}
