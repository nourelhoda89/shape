package edu.jalc.shape.rectangle;

class SquareTest{

   public void testArea(){
      System.out.println("Testing Square :: getArea");
      Square square = new Square(2);
      assert(square.getArea() == 4);
   }
   
   public void testPerimeter(){
      System.out.println("Testing Square :: getPerimeter");
      Square square = new Square(2);
      assert(square.getPerimeter() == 8);
   }
   
   public void testToString(){
      System.out.println("Testing Square :: toString");
      Square square = new Square(2);
      assert(square.toString().equals("The area of the square is " +square.getArea() 
                                     +"\nThe peremeter of the square is " +square.getPerimeter()));
   } 
   
   public static void main(String[] args){
      SquareTest test = new SquareTest();
      test.testArea();
      test.testPerimeter();
      test.testToString();
      System.out.println("All Square tests completed");

   }
}