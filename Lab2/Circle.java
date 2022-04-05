package Lab2;
// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 2

public class Circle {
    
    private double radius;
    private static int numberOfObject = 0; 
    //data not accesible by outside class

    public Circle(){
        numberOfObject++;
    }
    
    public Circle(double radius){
        numberOfObject++;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public int getNumberOfObject(){
        return numberOfObject;
    }

    public double getArea(){
        return (radius*radius*3.14159);
    }

    public static void printCircle(Circle c) {
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
        }
}
