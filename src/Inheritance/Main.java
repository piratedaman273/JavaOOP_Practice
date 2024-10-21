package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(10,11,12);
//        System.out.println(box1.l+" " +box1.w +" "+box1.h);
//        BoxWithWeight box2 = new BoxWithWeight(10,11,14,16);
//        System.out.println(box2.l+" " +box2.w +" "+box2.h+ " "+box2.weight);

        Box box3 = new BoxWithWeight(10,20,30,40);
        BoxWithWeight box4 = new BoxWithWeight(10,20,30,700);

        System.out.println(box3.l+" " +box3.w +" "+box3.h+ " ");

        BoxWithWeight box5 = new BoxWithWeight(box4);//We are sending box4 to copy constructor of BoxWithWeight
        System.out.println(box5.l+" " +box5.w +" "+box5.h+ " "+box5.weight);
    }
}
