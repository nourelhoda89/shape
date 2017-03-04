package edu.jalc.shape.foursidedshape;

import  edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public class FourSidedShape extends TwoDimensionalShape{
   public final double height;
   public final double base;


   private FourSidedShape(){
      this.height=this.base=0.0;
   }
   public FourSidedShape(double height,double base){
      this.height=height;
      this.base=base;
   }
   public double getArea(){
      double area=0.0;
      return area;
   }
   public double getPerimeter(){
      double perimeter=0.0;
      return perimeter;
   }
   public String toString(){
      String string="  ";
      return string;
   }
   public boolean equals(TwoDimensionalShape shape){
      return super.equals(shape);
   }
}
