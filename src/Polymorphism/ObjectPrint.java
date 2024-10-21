package Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num) {
        this.num = num;
    }
    @Override
    public String toString(){
        return "number is "+this.num;
    }
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(13);
        System.out.println(obj);

        //Polymorphism.ObjectPrint@6acbcfc0
    }

}
