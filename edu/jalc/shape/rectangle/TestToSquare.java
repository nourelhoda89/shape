package edu.jalc.shape.rectangle;
import java.util.*;

import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.righttriangle.RightTriangle;
import edu.jalc.shape.ellipse.Ellipse;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.rectangle.ToSquare;

class TestToSquare{

   public void testEllipseToSquare(){
      System.out.println("Testing ToSquare :: ellipse to square");
      Ellipse ellipse = new Ellipse(4.0,9.0);
      assert(Math.round(ToSquare.getInstance().toSquare(ellipse).getArea())== Math.round(ellipse.getArea()));
   }
   public void testRightTriangleToSquare(){
      System.out.println("Testing ToSquare :: rightTriangle to square");
      RightTriangle rightTriangle = new RightTriangle(2.0,6.0);
      assert(Math.round(ToSquare.getInstance().toSquare(rightTriangle).getArea())== Math.round(rightTriangle.getArea())); 
   }
   public void testRectangleToSquare(){
      System.out.println("Testing ToSquare :: rectangle to square");
      Rectangle rectangle= new Rectangle(2.0,12.0);
      assert(Math.round(ToSquare.getInstance().toSquare(rectangle).getArea())== Math.round(rectangle.getArea())); 
   }   
   public void testSquareToSquare(){
      System.out.println("Testing ToSquare :: circle to square");
      Circle circle= new Circle(8.0);
      assert(Math.round(ToSquare.getInstance().toSquare(circle).getArea()) == Math.round(circle.getArea())); 
   }
   
   public static void main(String[] args){
      TestToSquare test = new TestToSquare();
      
      test.testEllipseToSquare();
      test. testRightTriangleToSquare();
      test.testRectangleToSquare();
      test.testSquareToSquare();
     
   }
}