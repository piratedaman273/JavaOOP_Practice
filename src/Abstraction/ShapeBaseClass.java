package Abstraction;

abstract class ShapeBaseClass {
    int colorcode;

    public int getColorcode() {
        return colorcode;
    }
    public ShapeBaseClass(){

    }
    public ShapeBaseClass(int colorcode) {
        this.colorcode = colorcode;
    }
    abstract double GetArea();
    abstract void PrintArea();
}