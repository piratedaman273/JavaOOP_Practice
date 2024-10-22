package Abstraction.ViaInterfaces;

public class MyClassDefault implements Printable{
    public void Print(){
        System.out.println("Hi!! From MyClassDefault");
    }

    @Override
    public void PrintMessage() {
        System.out.println("Print Message overidden in MyClassDefault!! ");
    }
}
