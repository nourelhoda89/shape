package edu.jalc.shape;

public class Circle extends Ellipse{
   private double radius;

   private Circle(){
      super(0.0,0.0);
      this.radius=0;
   }
   public Circle(double radius){
      super(radius,radius);
   }
   public String toString(){
      return "The area of the Circle is " +getArea() +"\nThe circumference of the Circle is " +getPerimeter();
   }
   public boolean equals(TwoDimensionalShape shape){
      if(shape.getArea()==this.getArea()){
         return true;}
      else
         return false;
   }
   public boolean equals(TwoDimensionalShape shape1,TwoDimensionalShape shape2){
      return super.equals(shape1, shape2);
   }
   //just to check will delete later
   public static void main(String[] args){
      Circle circle = new Circle(5);
      System.out.println(circle.toString());
   }

}
