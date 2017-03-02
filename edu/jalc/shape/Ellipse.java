package edu.jalc.shape;
import java.lang.*;

public class Ellipse extends TwoDimensionalShape{
   private double minorAxis;
   private double majorAxis;

   private Ellipse(){
      this. minorAxis=0;
      this.majorAxis=0;
   }
   public Ellipse(double minorAxis,double majorAxis){
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
      return "The area of the ellipse is " +getArea() +"\nThe circumference of the ellipse is "+getPerimeter();
   }
   public boolean equals(TwoDimensionalShape shape1,TwoDimensionalShape shape2){
      return super.equals(shape1, shape2);
   }

   //just to check will delete later
   public static void main(String[] args){
      Ellipse ellipse = new Ellipse(5,2);
      System.out.println(ellipse.toString());
   }
}
