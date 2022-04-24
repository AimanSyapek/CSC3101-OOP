// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Employee {
    
    private String name;
    private int iD;
    private int age;
    private int salary;
    private String title;
    private String department;

    Employee(String name, int iD, int age, int salary, String title, String department){
        this.name = name;
        this.iD = iD;
        this.age = age;
        this.salary = salary;
        this.title = title;
        this.department = department;
    }

    public void printBiodata(){ //print all private data
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.iD);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: RM" + this.salary);
        System.out.println("Title: " + this.title);
        System.out.println("Department: " + this.department);
    }

    public void increaseSalary(int amount){
        this.salary += amount;
    }

    public double getSalary(){
        return salary;
    }

}
