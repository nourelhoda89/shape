package edu.jalc.shape.driver;

/*The driver should demonstrate use of polymorphism by comparing
different object instances. Your driver should have at least one
of each of your instantiable classes. You should be able to compare
these objects to see if they are of equal area. That means if I had
a rectangle with a height of 10 and a width of 2, it should equal a
triangle with a height of 10 and a base of 4.
*/
import java.util.*;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;
import edu.jalc.shape.foursidedshape.Rectangle;
import edu.jalc.shape.foursidedshape.Square;
import edu.jalc.shape.infinitsidedshape.Circle;
import edu.jalc.shape.infinitsidedshape.Ellipse;
import edu.jalc.shape.threesidedshape.Triangle;
import edu.jalc.shape.threesidedshape.RightTriangle;

public class Driver{

   public static void main(String... args){
      String shape1=null ,shape2=null;
      Scanner sc = new Scanner(System.in);
   
   
      Rectangle rectangle = new Rectangle(10,2);
      Square square = new Square(4);
      Triangle triangle =new Triangle(2,2,2);
      RightTriangle righttriangle = new RightTriangle(10,4,0);
      Ellipse ellipse = new Ellipse(2, 4);
      Circle circle = new Circle(4);
      
      System.out.println("To compare the area of two shapes, enter shape1:");
      shape1=sc.nextLine().toLowerCase();
      System.out.println("enter shape2:");
      shape2=sc.nextLine().toLowerCase();
      if (shape1.equals(shape2)==true){
         System.out.println("The Area of "+shape1+" is equal to the area of "+shape2);
      }
      else
         System.out.println("The Area of "+shape1+" is not equal to the area of "+shape2);
   
   }
}
