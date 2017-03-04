package edu.jalc.shape.foursidedshape;

public class Square extends Rectangle{

   private Square(){
      super(0.0,0.0);
   }
   public Square(double height){
      super(height,height);
   }
   public String toString(){
      return "The area of the square is " +getArea() +"\nThe peremeter of the square is " +getPerimeter();
   }
}
