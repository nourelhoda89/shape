package edu.jalc.shape.rectangle;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public final class Square extends Rectangle{

   private Square(){
      super(0.0,0.0);
   }
   public Square(double length){
      super(length,length);
   }
   public final String toString(){
      return "The area of the square is " +getArea() +"\nThe peremeter of the square is " +getPerimeter();
   }
   public final static  Square toSquare(TwoDimensionalShape shape){
      double length=Math.sqrt(shape.getArea());
      return new Square(length);
   }
}