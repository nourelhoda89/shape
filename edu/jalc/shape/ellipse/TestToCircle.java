package edu.jalc.shape.ellipse;
import java.util.*;

import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.righttriangle.RightTriangle;
import edu.jalc.shape.ellipse.Ellipse;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.ellipse.ToCircle;

class TestToCircle{
    
   public void testEllipseToCircle(){
      System.out.println("Testing ToCircle :: ellipse to circle");
      Ellipse ellipse = new Ellipse(4.0,9.0);
      assert(Math.round(ToCircle.getInstance().toCircle(ellipse).getArea())== Math.round(ellipse.getArea())); 
   }
   public void testRightTriangleToCircle(){
      System.out.println("Testing ToCircle :: rightTriangle to circle");
      RightTriangle righttriangle = new RightTriangle(2.0,6.0);
      assert(Math.round(ToCircle.getInstance().toCircle(righttriangle ).getArea())== Math.round(righttriangle.getArea())); 
   }
   public void testRectangleToCircle(){
      System.out.println("Testing ToCircle :: rectangle to circle");
      Rectangle rectangle= new Rectangle(2.0,12.0);
      assert(Math.round(ToCircle.getInstance().toCircle(rectangle).getArea())== Math.round(rectangle.getArea())); 
   }   
   public void testSquareToCircle(){
      System.out.println("Testing ToCircle :: square to circle");
      Square square = new Square(6.0);
      assert(Math.round(ToCircle.getInstance().toCircle(square).getArea()) == Math.round(square.getArea())); 
   }
   public static void main(String[] args){
      TestToCircle test = new TestToCircle();
      
      test.testEllipseToCircle();
      test. testRightTriangleToCircle();
      test.testRectangleToCircle();
      test.testSquareToCircle();
     
   }
}