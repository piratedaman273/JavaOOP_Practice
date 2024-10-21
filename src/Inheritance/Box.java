package Inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){  //We must have a default constructor explicitly defined in base class if we are using
            //Parameterised constructor BECAUSE default will be called from base.
        System.out.println("Base default constructor!!");
    }
    Box(double l,double w,double h){
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println("Base parameterised constructor!!");
    }
    Box(Box box){           //Basically copy constructor
        this.l = box.l;
        this.w = box.w;
        this.h = box.h;

    }
}
