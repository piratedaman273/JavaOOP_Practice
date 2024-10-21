package Abstraction;

public class Square extends ShapeBaseClass {
    double side;

    public Square(int colorcode, double side) {
        super(colorcode);
        this.side = side;
    }
    double GetArea(){
        return side*side;
    }
    void PrintArea(){
        System.out.println("Area of given square is "+GetArea()+" Colorcode of square is "+getColorcode());
    }
}
