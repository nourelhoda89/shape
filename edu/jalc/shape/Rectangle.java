package edu.jalc.shape;

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


   public String toString(){
      return "The area of the rectangle is " +getArea() +"\nThe perimeter of the rectangle is "+getPerimeter();
   }

   public boolean equals(TwoDimensionalShape shape1,TwoDimensionalShape shape2){
      return super.equals(shape1, shape2);
   }
   /*//if I chose to use "this" in the super equal method I can do the following here:
   //which limit the comparasion to any shape with rectangle.
    public boolean equals(TwoDimensionalShape shape){
      return super.equals(shape);
   }*/
   
   //just to check will delete later
   public static void main(String[] args){
      Rectangle rectangle = new Rectangle(5,5);
      System.out.println(rectangle.toString());
      Square square= new Square(5);
      System.out.println(rectangle.equals(square,rectangle));
   
   
   
   }
}
