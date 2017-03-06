package edu.jalc.shape.driver;

import java.util.*;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.ellipse.Ellipse;
import edu.jalc.shape.righttriangle.RightTriangle;

public class Driver{

   public static void main(String... args){
      String shape1=null ,shape2=null;
      Scanner sc = new Scanner(System.in);
      
      Rectangle rectangle = new Rectangle(4,4);
      Square square = new Square(4);
      RightTriangle rightTriangle = new RightTriangle(10,4);
      Ellipse ellipse = new Ellipse(2,4);
      Circle circle = new Circle(4);
      
      System.out.println(ellipse.toString());
      System.out.println();
      System.out.println(circle.toString());
      System.out.println();
      System.out.println(rectangle.toString());
      System.out.println();
      System.out.println(square.toString());
      System.out.println();
      System.out.println(rightTriangle.toString());
      System.out.println();
      
       
      System.out.println(rectangle.equals(rightTriangle));
      System.out.println(square.equals(rectangle));
      System.out.println(rightTriangle.equals(square));
      System.out.println(ellipse.equals(circle));
      System.out.println(circle.equals(square));
   }
}
