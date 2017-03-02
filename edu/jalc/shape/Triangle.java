package edu.jalc.shape;

public class Triangle extends TwoDimensionalShape{
   private double height;
   private double base;
   private double side1;
   private double side2;

   private Triangle(){
      this.height=0;
      this.base=0;
      this.side1=0;
      this.side2=0;
   }
   public Triangle(double height,double base,double side1,double side2){
      this.height=height;
      this.base=base;
      this.side1=side1;
      this.side2=side2;
   }
   public double getArea(){
      return (height*base/2);

   }
   public double getPerimeter(){
      return base+side1+side2;
   }

 // human readable toString method detailing their properties.
   public String toString(){
      return "The area of the triangle is " +getArea() +"\nThe Perimeter of the triangle is "+getPerimeter();

   }
 //equals method,must be able to compare any TwoDimensionalShape
 //to see if their getAreas are equal
   public boolean equals(){
   return false;
   }

   //just to check will delete later
   public static void main(String[] args){
      Triangle triangle = new Triangle(1,1,1,1);
      System.out.println(triangle.toString());
   }
}
