package edu.jalc.shape.threesidedshape;

public class RightTriangle extends Triangle{
   private final double height;
   private final double base;

   private RightTriangle(){
      super(0,0,0);
      this.height=this.base=0.0;
   }
   public RightTriangle(double height,double base,double side){
      super(height,base,side);
      this.height=height;
      this.base=base;
   }
   public double getArea(){
      return 0.5*(height*base);
   }
   public String toString(){
      return "The area of the right triangle is " +getArea() +"\nThe perimeter of the right triangle is " +getPerimeter();
   }

}
