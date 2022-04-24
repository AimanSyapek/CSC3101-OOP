// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Quiz Array Object, Object Parameter Passing

public class Student {
	
	//Data section
	private int id;
	private String name;
	private int age;
	
	//methods /behaviour of the class
	// Constructor
	
	public Student(){
		System.out.println("Welcome");	
	}
	
	
	public Student(String name, int id, int age){		
		this.name = name;
		this.id = id;
		this.age = age;		
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void registerCourse() {
		System.out.println("All courses have been registered");
	}
	
	public void dropCourse() {
		System.out.println("No course has been dropped");
		
	}
	
	public void payFees() {
		System.out.println("Fees has been fully paid. Thank you!\n\n");
		
	}
	
}
