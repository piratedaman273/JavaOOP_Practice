package Inheritance;

public class Vehicle {
    protected int speed;
    protected int fuelLevel;
    protected String fuelType;
    protected int fuelCapacity;
    protected String model;
    public Vehicle(int speed,int fuelLevel,int fuelCapacity,String fuelType,String model){
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.fuelCapacity = fuelCapacity;
        this.fuelType = fuelType;
        this.model = model;
    }
    protected void VehicleStart(){
        System.out.println(model +"Vehicle Started!!");
    }
    protected void VehicleStop(){
        System.out.println(model +"Vehicle Stop!!");
    }
    protected void VehicleDrive(){
        System.out.println("Vehicle starts!!");
    }
    protected void refuel(){
        if(fuelLevel>=fuelCapacity){
            System.out.println("Tank is full!!");
        }else{
            System.out.println("Refueling in process!!");
            fuelLevel+=fuelCapacity;
        }
    }
}
