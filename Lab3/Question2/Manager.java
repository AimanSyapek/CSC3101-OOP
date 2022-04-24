// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Manager extends Employee{
    
    private String position;
    private int bonus;

    Manager(String name, int iD, int age, int salary, String title, String department, String position, int bonus) {
        super(name, iD, age, salary, title, department);
        this.position = position;
        this.bonus = bonus;
    }

    public void bonusDay(int bonus){ //add bonus to person's salary
        this.bonus = bonus;
        System.out.println("Current salary: RM" + this.getSalary());
        System.out.println("New bonus: RM" + this.bonus);
    }
    
    public void printPosition(){ //can only print 3 things, anything else is ignored
        System.out.print("Position: ");
        if (this.position.toLowerCase() == "supervisor")
            System.out.println("Supervisor");
        else if (this.position.toLowerCase() == "manager")
            System.out.println("Manager");
        else if (this.position.toLowerCase() == "account")
            System.out.println("Account");
        else
            System.out.println("");
    }
}
