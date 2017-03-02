package edu.jalc.shape;

abstract public class TwoDimensionalShape {

   abstract public double getArea();
   abstract public double getPerimeter();
   
    public boolean equals(TwoDimensionalShape shape1,TwoDimensionalShape shape2){
      if(shape1.getArea()==shape2.getArea()){
         return true;}
      else
         return false;
   }
   /* equals method could be the following:
   public boolean equals(TwoDimensionalShape shape){
      if(shape.getArea()==this.getArea()){
         return true;}
      else
         return false;
   }*/
}