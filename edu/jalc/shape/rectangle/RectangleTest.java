package edu.jalc.shape.rectangle;

class RectangleTest{

   public void testArea(){
      System.out.println("Testing Rectangle :: getArea");
      Rectangle rectangle = new Rectangle(10.0,2.0);
      assert(rectangle.getArea() == 20.0);
   }
   
   public void testPerimeter(){
      System.out.println("Testing Rectangle :: getPerimeter");
      Rectangle rectangle = new Rectangle(10.0,2.0);
      assert(rectangle.getPerimeter() == 24.0);
   }
   
   public void testToString(){
      System.out.println("Testing Rectangle :: toString");
      Rectangle rectangle = new Rectangle(10.0,2.0);
      assert(rectangle.toString().equals( "The area of the Rectangle is " +rectangle.getArea() 
                                         +"\nThe perimeter of the Rectangle is "+rectangle.getPerimeter()));
   } 
   
   public static void main(String[] args){
      RectangleTest test = new RectangleTest();
      test.testArea();
      test.testPerimeter();
      test.testToString();
      System.out.println("All Rectangle tests completed");
   }
}
