public class SmpSystem {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student(210564,"Aiman Syafiq", 15);
        std1.name = "Farquad";
        std1.id = 456789;
        std1.register();
        System.out.println("Student 2 information:");
        std2.printInfo();
        std1.payFee();
    }
}
