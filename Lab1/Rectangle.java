// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 1 Question 1

public class Rectangle{
    double width;
    double height;

    //first Contructor with default is created with default values
    public Rectangle(){ 
        width = 1;
        height = 1;
    }

    //a different constructor for user to
    public Rectangle(double newWidth, double newHeight){
        width = newWidth; //set new width
        height = newHeight;
        //Beyond this is only for ease of printing
        System.out.println("Reference/Address Rectangle: " + this);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter() + "\n");
    }

    public double getArea(){
        return height*width; //Area of rectangle calculated and return
    }

    public double getPerimeter(){
        return 2*(height+width); //Perimeter of rectangle calculated and return
    }


}