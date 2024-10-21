package Abstraction.ViaAbstractClass;

import Abstraction.ViaAbstractClass.ShapeBaseClass;

public class Rectangle extends ShapeBaseClass {
    int length;
    int bredth;
    int colorCode;
    public Rectangle(int length,int bredth,int colorCode){
        super(colorCode);
        this.length= length;
        this.bredth = bredth;
    }
    double GetArea(){
        return length*bredth;
    }
    void PrintArea(){
        System.out.println("Area of given rectangle is "+GetArea()+" ColorCode of Rectangle is "+ getColorcode());
    }
}
