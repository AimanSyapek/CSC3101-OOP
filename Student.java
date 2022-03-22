public class Student{
    int id;
    String name;
    int age;
    public Student(){
        System.out.println("You suck because default value is set on this fuking class");
        id = 1;
        name = "";
        age = 1;
    }

    public Student(int newID, String newName, int newAge){
        id = newID;
        name = newName;
        age = newAge;
    }
    
    public void register(){
        System.out.println("Student is registered");
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + name);
        System.out.println("Age: " + name);
    }

    public void payFee(){
        System.out.println("Fee has Paid. You're set to go");
    }
}