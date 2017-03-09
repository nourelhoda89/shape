package edu.jalc.shape.ellipse;

public  class Circle extends Ellipse{
   private double radius;

   private Circle(){
      super(0.0,0.0);
      this.radius=0;
   }
   public Circle(double radius){
      super(radius,radius);
      this.radius = radius;
   }
   public  double getCircumference(){
      return 2*Math.PI*radius;
   }
   public String toString(){
      return "The area of the Circle is " +getArea() +"\nThe circumference of the Circle is " +getCircumference();
   }
}
