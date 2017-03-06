package edu.jalc.shape.rectangle;

import  edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public class Rectangle extends TwoDimensionalShape{
   private final double length;
   private final double width;
   
   private Rectangle(){
      this.length=this.width =0.0;
   }
   public Rectangle(double length,double width){
    this.length=length;
    this.width =width;  
   }
   public double getArea(){
      return length*width;
   }
   public double getPerimeter(){
      return 2*(length+width);
   }
   public String toString(){
      return "The area of the Rectangle is " +getArea() +"\nThe perimeter of the Rectangle is "+getPerimeter();
   }   
 }