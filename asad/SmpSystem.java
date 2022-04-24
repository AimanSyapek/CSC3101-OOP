// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Quiz Array Object, Object Parameter Passing

import java.util.Scanner;

import Student;

public class SmpSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 1;
		
		//how mane student we want to input
		System.out.print("Enter the number of student: ");
		size = sc.nextInt();
		
		//declare array size based on the number of student entered
		Student[] stud = new Student[size]; 	
		
		//call read method to input student info
		stud = read(stud,size,sc);
		
		//call print method to print all records that have been entered before
		print(stud);
		sc.close();
		
	}
	
	
	public static Student[] read(Student[] stud, int size, Scanner sc) {
				
		for (int i=0; i<size; i++) {
			//input section for student 1///========================
			System.out.print("Enter short name: ");
			String shortName = sc.next();
		
			System.out.print("Enter Student id: ");
			int id = sc.nextInt();
		
			System.out.print("Enter Age: ");
			int age = sc.nextInt();
		
			//create object based on input				
			stud[i] = new Student(shortName, id, age); //an object created from student
			System.out.println(":: Object for Student #"+(i+1)+" has been created!");
			System.out.println("=======================================\n");
			
			//=============================================
		}
		
		return stud;

	}
	
		public static void print(Student[] stud) {
			System.out.println("SMP UPM");
			System.out.println("Printing Output");
			
			int index=1;
		
			for(Student s : stud) {
				System.out.println("\nThis is Student #" + (index));
				
				System.out.println("Name : "+ s.getName());
				System.out.println("ID : "+ s.getId());
				System.out.println("Age : "+ s.getAge());
		
				s.registerCourse();
				s.dropCourse();
				s.payFees();
				index++;
			}
		
		
				
	}

} 
