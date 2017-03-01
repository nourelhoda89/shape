package edu.jalc.twoDimensionalShape;

public class Rectangle extends TwoDimensionalShape{
   private double height;
   private double width;
   
   private Rectangle(){
   
      this.height=0;
      this.width=0;
   }
   public Rectangle(double height,double width){
      this.height=height;
      this.width=width;
   }
   public double getArea(){
      return height*width;
   
   }
   public double getPerimeter(){
      return 2*height+2*width;
   }
   
// human readable toString method detailing their properties.
   public String toString(){
      return "The area of the rectangle is " +getArea() +"\nThe perimeter of the rectangle is "+getPerimeter();  
   }
//equals method,must be able to compare any TwoDimensionalShape 
//to see if their getAreas are equal
   public boolean equals(){
      return false;
   }
   //just to check will delete later
   public static void main(String[] args){
      Rectangle rectangle = new Rectangle(5,2);
      System.out.println(rectangle.toString());
   
   }
}
