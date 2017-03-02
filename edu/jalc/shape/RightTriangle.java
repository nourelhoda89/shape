package edu.jalc.shape;

public class RightTriangle extends Triangle{
   private double height;
   private double base;
   private double side;


   private RightTriangle(){
      super(0.0,0.0,0.0,0.0);
      this.height=0.0;
      this.base=0.0;
      this.side=Math.sqrt((height*height)+(base*base));
   }
   public RightTriangle(double height, double base,double side){
          super(height,base,side,height);
   }
    public String toString(){
      return "The area of the right triangle is " +getArea() +"\nThe peremeter of the right triangle is " +getPerimeter();
   }
   //just to check will delete later
   public static void main(String[] args){
      RightTriangle rightTriangle = new RightTriangle(1.0,1.0,1.0);
      System.out.println(rightTriangle.toString());
   }

}
