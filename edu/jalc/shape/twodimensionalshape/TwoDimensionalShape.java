package edu.jalc.shape.twodimensionalshape;

abstract public class TwoDimensionalShape {

   abstract public double getArea();
   
   public boolean equals(TwoDimensionalShape shape){
      return (shape.getArea()==this.getArea());
   }
}
