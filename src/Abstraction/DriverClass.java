package Abstraction;

public class DriverClass {
    public static void main(String[] args) {
        ShapeBaseClass sq = new Square(10,5);
        sq.PrintArea();
        Rectangle rectangle = new Rectangle(12,10,20);
        rectangle.PrintArea();

        //We cannot create instances of abstract class eg
        //This will give an error
        //ShapeBaseClass sc = new ShapeBaseClass(10);

        //we can have Abstract class as reference
        ShapeBaseClass sq1 = new Square(10,5);

        //A class can be abstract without any abstract without any abstract methods. It is useful when we don't
        //want to create objects of a class.
    }
}
