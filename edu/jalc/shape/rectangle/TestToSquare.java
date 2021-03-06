package edu.jalc.shape.rectangle;
import java.util.*;

import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.righttriangle.RightTriangle;
import edu.jalc.shape.ellipse.Ellipse;
import edu.jalc.shape.ellipse.Circle;

class TestToSquare{

   public void testEllipseToSquare(){
      System.out.println("Testing toSquare :: ellipse to square");
      Ellipse ellipse = new Ellipse(4.0,9.0);
      assert(Math.round(Square.toSquare(ellipse).getArea())== Math.round(ellipse.getArea())); 
   }
   public void testRightTriangleToSquare(){
      System.out.println("Testing toSquare :: rightTriangle to square");
      RightTriangle rightTriangle = new RightTriangle(2.0,6.0);
      assert(Math.round(Square.toSquare(rightTriangle).getArea())== Math.round(rightTriangle.getArea())); 
   }
   public void testRectangleToSquare(){
      System.out.println("Testing toSquare :: rectangle to square");
      Rectangle rectangle= new Rectangle(2.0,12.0);
      assert(Math.round(Square.toSquare(rectangle).getArea())== Math.round(rectangle.getArea())); 
   }   
   public void testSquareToSquare(){
      System.out.println("Testing toSquare :: circle to square");
      Circle circle= new Circle(8.0);
      assert(Math.round(Square.toSquare(circle).getArea()) == Math.round(circle.getArea())); 
   }
   
   public static void main(String[] args){
      TestToSquare test = new TestToSquare();
      
      test.testEllipseToSquare();
      test. testRightTriangleToSquare();
      test.testRectangleToSquare();
      test.testSquareToSquare();
     
   }
}