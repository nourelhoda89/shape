package edu.jalc.shape.driver;

import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.ellipse.ToCircle;
import edu.jalc.shape.ellipse.Ellipse;
import edu.jalc.shape.righttriangle.RightTriangle;

public class Driver{

   public static void main(String... args){
         
      Rectangle rectangle = new Rectangle(10,2);
      Square square = new Square(4);
      RightTriangle rightTriangle = new RightTriangle(10,4);
      Ellipse ellipse = new Ellipse(4,4);
      Circle circle = new Circle(4);
      
      System.out.println(ellipse.toString());
      System.out.println("\n"+circle.toString());
      System.out.println("\n"+rectangle.toString());
      System.out.println("\n"+square.toString());
      System.out.println("\n"+rightTriangle.toString());
     
      
      System.out.println("\n"+ellipse.equals(circle));
      System.out.println(circle.equals(rectangle));
      System.out.println(square.equals(rectangle));
      System.out.println(rightTriangle.equals(ellipse));
      System.out.println(rectangle.equals(rightTriangle));
      
      System.out.println("\n"+ToCircle.getInstance().toCircle(rectangle));
      System.out.println("\n"+ToCircle.getInstance().toCircle(square));
      System.out.println("\n"+ToCircle.getInstance().toCircle(rightTriangle));
      System.out.println("\n"+ToCircle.getInstance().toCircle(ellipse));
      
     /* System.out.println("\n"+square.toSquare(rectangle));
      System.out.println("\n"+square.toSquare(circle));
      System.out.println("\n"+square.toSquare(rightTriangle));
      System.out.println("\n"+square.toSquare(ellipse));
   */
   
   
   }
}