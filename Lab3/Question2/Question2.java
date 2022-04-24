// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 3

public class Question2 {
    public static void main(String[] args) {
        Employee employ1 = new Employee("Aiman Syafiq", 210564, 20, 0, "Intern", "Multimedia");
        Employee employ2 = new Employee("Izuan", 101010, 28, 20000, "Head of Engineers", "Human Resources");
        Employee employ3 = new Employee("Jugemu Jugemu Goko no Surikire Kaijarisuigyo no Suigyomatsu Unraimatsu Furaimatsu Ku Neru Tokoro ni Sumu Tokoro Yabura Koji no Bura Koji Paipo-paipo Paipo no Shurigan Shuringan no Gurindai Gurindai no Ponpokopi no Ponpokona no Chokoyumwi no Chosuke", 201700, 12017, 1, "Longest name", "Fighting Division");
        Manager manage1 = new Manager("Joe Mama", 7, 54, 2000, "Cruel Boss", "Multimedia", "manager", 20);
        Manager manage2 = new Manager("Candice Nas", 42069, 69, 42000, "Chad", "Unknown", "account", 69);
        System.out.println("Employee 1");
        employ1.printBiodata();
        System.out.println("\nEmployee 2");
        employ2.printBiodata();
        System.out.println("\nEmployee 3");
        employ3.printBiodata();
        System.out.println("\nManager 1");
        manage1.printPosition();
        manage1.printBiodata();
        manage1.bonusDay(400);
        System.out.println("\nManager 2");
        manage2.printPosition();
        manage2.increaseSalary(69);
        manage2.printBiodata();
        
    }
}
