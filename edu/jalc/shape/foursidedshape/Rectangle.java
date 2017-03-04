package edu.jalc.shape.foursidedshape;

public class Rectangle extends FourSidedShape{

   private Rectangle(){
      super(0.0,0.0);
   }
   public Rectangle(double height,double base){
      super(height,base);
   }
   public double getArea(){
      return height*base;
   }
   public double getPerimeter(){
      return 2*(height+base);
   }
   public String toString(){
      return "The area of the Rectangle is " +getArea() +"\nThe perimeter of the Rectangle is "+getPerimeter();
   }   
}
