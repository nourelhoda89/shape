package edu.jalc.shape.threesidedshape;

import  edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public class Triangle extends TwoDimensionalShape{

   private final double side1;
   private final double side2;
   private final double side3;

   private Triangle(){
      this.side1=this.side2=this.side3=0;
   }
   public Triangle(double side1,double side2,double side3){
      this.side1=side1;
      this.side2=side2;
      this.side3=side3;
   }
   //using Heron's formula
   public double getArea(){
      double p = this.getPerimeter()/2;
      return Math.sqrt(p * (p -side1) * (p -side2) * (p - side3));
   }
   public double getPerimeter(){
      return side1+side2+side3;
   }

   public String toString(){
      return "The area of the triangle is " +getArea() +"\nThe Perimeter of the triangle is "+getPerimeter();
   }
   public boolean equals(TwoDimensionalShape shape){
      return super.equals(shape);
   }
}
