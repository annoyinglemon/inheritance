
/**
 * Write a description of class VehicleDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehicleDemo
{
    
    public static void main(String[] args){
    Vehicle Pedicab = new Vehicle();
    Vehicle Tricycle = new Vehicle();
    Truck Isuzu = new Truck();
    Truck OptimusPrime = new Truck(); 

    Pedicab.writeOutput();
    System.out.println();   //blank
    Tricycle.writeOutput();
    System.out.println();   //blank

    Pedicab.setVehicle("BMX", 200.15, "HarleyDavidson");
    Tricycle.setVehicle("Racal", 125.5, "kawasaki");
    Pedicab.writeOutput();

    System.out.println();   //blank
    Tricycle.writeOutput();

    System.out.println();   //blank
    System.out.println("Return Methods:");
    System.out.println("Manufacturer's Name: "+ Pedicab.getManuf());
    System.out.println("Number of Cylinders: "+ Pedicab.getCyl());
    System.out.println("Owner's Name: "+ Pedicab.getOwner());

    System.out.println();   //blank
    System.out.println("Return Methods:");
    System.out.println("Manufacturer's Name: "+ Tricycle.getManuf());
    System.out.println("Number of Cylinders: "+ Tricycle.getCyl());
    System.out.println("Owner's Name: "+ Tricycle.getOwner());

    System.out.println();   //blank

    if (Pedicab.sameVehicle(Tricycle)){
    System.out.println("It is equal");
    }
    else{
    System.out.println("It is not equal");
    }
    System.out.println();   //blank
    System.out.println("Trucks:");
    Isuzu.writeOutput();
    System.out.println();   //blank
    OptimusPrime.writeOutput();
    System.out.println();   //blank

    Isuzu.resetVehicle("Isuzu", 1000, "Jake The Dog", 900.80, 1500);
    OptimusPrime.resetVehicle("AutoBots", 5000, "Finn the Human", 6000, 4902);
    Isuzu.writeOutput();
    System.out.println();   //blank
    OptimusPrime.writeOutput();
    System.out.println();   //blank
    System.out.println("Return Methods:");
    System.out.println("Load Capacity of "+ Isuzu.getManuf() + ": " + Isuzu.getLc());
    System.out.println("Towing Capacity of " + Isuzu.getManuf() + ": " + Isuzu.getTc());
    System.out.println();   //blank
    System.out.println("Load Capacity of " + OptimusPrime.getManuf()+ ": " + OptimusPrime.getLc());
    System.out.println("Towing Capacity of "+ OptimusPrime.getManuf()+ ": " + OptimusPrime.getTc() );
    
    System.out.println();   //blank
    
    if (Isuzu.sameTruck(OptimusPrime)){
    System.out.println("It is equal");
    }
    else{
    System.out.println("The Load Capacity and Towing Capacity are not equal");
    }
    
}
}
   

