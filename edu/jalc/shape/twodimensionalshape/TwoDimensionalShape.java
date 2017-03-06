package edu.jalc.shape.twodimensionalshape;

abstract public class TwoDimensionalShape {

   abstract public double getArea();
   
   public final boolean equals(TwoDimensionalShape shape){
      return (shape.getArea()==this.getArea());
   }
}
