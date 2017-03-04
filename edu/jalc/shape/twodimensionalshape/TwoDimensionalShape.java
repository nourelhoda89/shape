package edu.jalc.shape.twodimensionalshape;

abstract public class TwoDimensionalShape {

   abstract public double getArea();
   abstract public double getPerimeter();
   abstract public String toString();
   public boolean equals(TwoDimensionalShape shape){
      if(shape.getArea()==this.getArea()){
         return true;}
      else
         return false;
   }
}
