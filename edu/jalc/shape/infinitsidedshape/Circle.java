package edu.jalc.shape.infinitsidedshape;

import  edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;


public class Circle extends Ellipse{
   private double radius;

   private Circle(){
      super(0.0,0.0);
      this.radius=0;
   }
   public Circle(double radius){
      super(radius,radius);
   }
   public String toString(){
      return "The area of the Circle is " +getArea() +"\nThe circumference of the Circle is " +getPerimeter();
   }
}
