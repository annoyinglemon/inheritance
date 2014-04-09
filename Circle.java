/*  static ----> nonstatic    calling object
 *  static ----> static       class name required
 *  nonstatic ----> static    direct(deafult)
 *  nonstatic ----> nonstatic    direct (default)
 * 
 */
import java.util.Scanner;                           
public class Circle     
{
   private double diameter;
   
   public static final double PI = 3.14159;         //declaring a constant in java, cannot be changed because of final
                                                    //cannot be used in another class because of static, it becomes a class variable
    
    public static void main(String[] args){        //a static method calling a nonstatic method should use a calling object
        Circle c = new Circle();                   //a static method calling another static method uses class name only and no object required
        c.setDiameter(2);                          //private methods cannot be inherited so it is set to public static but belongs to class itself and cannot be use in another class by using another object
        System.out.println("If circle has diameter 2,");
        c.showArea();
        System.out.println("Now you choose the diamter: ");
        Circle.areaDialog();
    }
                                
      public void setDiameter(double d){
        diameter = d;
    }
    
    public static double area(double r){            
        return (PI * r * r);
    }
    
    public void showArea(){                    // nonstatic calling a static, direct call only,(default)
        System.out.println("Area is " + area(diameter/2));      //nonstatic calling nonstatic is default
    }
    
    public static void areaDialog(){                
        Scanner s = new Scanner(System.in);
        System.out.println("Enter diameter of circle: ");
        double newdiameter = s.nextDouble();
        Circle c2 = new Circle();
        c2.setDiameter(newdiameter);
        c2.showArea();
    }

    
}

