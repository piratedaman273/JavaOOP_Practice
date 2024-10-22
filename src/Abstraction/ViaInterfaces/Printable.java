package Abstraction.ViaInterfaces;

public interface Printable {

    int x = 10; //This data member is allowed. BUT
    //All data members in interfaces are (public static final) by default.
    public static final int y = 12; //we can write this or just int y = 12; same stuff.

    void Print();

//Everything is public by default in Interfaces, even if we dont specify it, it will be public by default
//Write any other access modifier and compile-time error will occur.

//All methods are abstract by default.

//We can also have default and static methods.

//A class can implement more than on interface.

//An interface can extend more than one interface

//We can also have default and static method these were introduced in java 1.8 because say we implemented this
//interface in 100s of classes and now we need to add another method in interface the whole code will break,
//because then we have to implement that method in 100s of classes. for that reason default was introduced so
//that we could provide some implementation for that piece of code as well.

    //eg below
    default void PrintMessage() {
        System.out.println("Default Message Print from Interface!!");
    }
    //We have overidden this method in MyClassDefault. But we dont need to implement it in every class that is
    //implementing this interface, because PrintMessage() default implementation will be automatically
    //available in every class that is implementing this interface.
}