package Inheritance;

public class BoxWithWeight extends Box{
    double weight;
    BoxWithWeight(double weight){
        this.weight = weight;
    }
    BoxWithWeight(double l, double w,double h,double weight){
        super(l,w,h); //This is calling parent class constructor to initialise these three values
        this.weight = weight;//Weight will be initialised here.
    }
    BoxWithWeight(BoxWithWeight other){
        super(other); //Box(Box box) --> we are sending an object of type BoxWithWeight so Box can access the
                        //l,w,h values of other because its reference variable is of type Box in its parent class
                        //
        this.weight = other.weight;
    }

}
