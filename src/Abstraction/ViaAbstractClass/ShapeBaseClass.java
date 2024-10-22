package Abstraction.ViaAbstractClass;

public abstract class ShapeBaseClass {
    int colorcode;

    public int getColorcode() {
        return colorcode;
    }
    public ShapeBaseClass(){

    }
    public ShapeBaseClass(int colorcode) {
        this.colorcode = colorcode;
    }
    public abstract double GetArea();
    public abstract void PrintArea();
}
