
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle
{
    private String manufName;
    private double cylinder;
    private String owner;

    public Vehicle(){
    manufName = "no name yet";
    cylinder = 0;
    owner = "no name yet";
    }
    /*public Vehicle(String manufName1, double cylinder1, String owner1){
    manufName = manufName1;
    cylinder = cylinder1;
    owner = owner1;
    } */
    public void setVehicle(String newManuf, double newCyl, String newOwner){
    manufName = newManuf;
    cylinder = newCyl;
    owner = newOwner;
    }
    public String getManuf(){
    return manufName;
    }
    public double getCyl(){
    return cylinder;
    }
    public String getOwner(){
    return owner;
    }
    public void writeOutput(){
    System.out.println("Manufacturer's Name: " + manufName);
    System.out.println("Number of Cylinders: " + cylinder);
    System.out.println("Owner's Name: " + owner);
    }
    public boolean sameVehicle(Vehicle otherVehicle){
    return (this.manufName.equalsIgnoreCase(otherVehicle.manufName) && (this.cylinder == otherVehicle.cylinder) && (this.owner.equalsIgnoreCase(otherVehicle.owner)));
    }
}
