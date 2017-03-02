package edu.jalc.shape;

public class Square extends Rectangle{
   private double side;

   private Square(){
      super(0.0,0.0);
      this.side=0;
   }
   public Square(double side){
      super(side,side);
   }
   public String toString(){
      return "The area of the square is " +getArea() +"\nThe peremeter of the square is " +getPerimeter();
   }
   public boolean equals(TwoDimensionalShape shape1,TwoDimensionalShape shape2){
      return super.equals(shape1, shape2);
   }
   //just to check will delete later
   public static void main(String[] args){
      Square square = new Square(5);
      System.out.println(square.toString());
      Rectangle rectangle = new Rectangle(5,5);
      System.out.println(square.equals(square,rectangle));
   
   }

}
