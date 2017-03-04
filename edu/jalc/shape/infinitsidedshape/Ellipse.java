package edu.jalc.shape.infinitsidedshape;

import java.lang.*;

public class Ellipse extends InfinitSidedShape{
   private final double minorAxis;
   private final double majorAxis;

   private  Ellipse(){
      this. minorAxis=0;
      this.majorAxis=0;
   }
   public  Ellipse(double minorAxis,double majorAxis){
      this.minorAxis=minorAxis;
      this.majorAxis=majorAxis;
   }
   public double getArea(){
      return  Math.PI*minorAxis*majorAxis;
   
   }
   public double getPerimeter(){
      return 2*Math.PI * Math.sqrt((minorAxis + majorAxis)/2);
   }
   public String toString(){
      return "The area of the  Ellipse is " +getArea() +"\nThe circumference of the Ellipse is "+getPerimeter();
   }
}
