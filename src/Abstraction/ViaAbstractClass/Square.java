package Abstraction.ViaAbstractClass;

public class Square extends ShapeBaseClass {
    double side;

    public Square(int colorcode, double side) {
        super(colorcode);
        this.side = side;
    }
    public double GetArea(){
        return side*side;
    }
    public void PrintArea(){
        System.out.println("Area of given square is "+GetArea()+" Colorcode of square is "+getColorcode());
    }
}
