package Abstraction.ViaInterfaces;

public interface Printable {

    int x = 10; //This data member is allowed. BUT
                //All data members in interfaces are (public static final) by default.
    public static final int y = 12; //we can write this or just int y = 12; same stuff.

    void Print();
}
//Everything is public by default in Interfaces, even if we dont specify it, it will be public by default
//Write any other access modifier and compile-time error will occur.

//All methods are abstract by default.

//We can also have default and static methods.

//A class can implement more than on interface.

//An interface can extend more than one interface