package edu.jalc.shape.righttriangle;

import  edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public class RightTriangle extends TwoDimensionalShape{

   private final double height; 
   private final double base;
   
   private RightTriangle(){
      this.height=this.base=0;
   }
   public RightTriangle(double height,double base){
      this.height=height;
      this.base=base;
   }
   public double getArea(){
      return(height*base)/2;
   }
   public double getPerimeter(){
      return height+ base + Math.sqrt(height*height + base*base);
   }

   public String toString(){
      return "The area of the right triangle is " +getArea() +"\nThe Perimeter of the right triangle is "+getPerimeter();
   }
}
