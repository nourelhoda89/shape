package edu.jalc.shape.righttriangle;

class RightTriangleTest{

   public void testArea(){
      System.out.println("Testing RightTriangle :: getArea");
      RightTriangle rightTriangle = new RightTriangle(10.0,4.0);
      assert(rightTriangle.getArea() == 20);
   }
   
   public void testPerimeter(){
      System.out.println("Testing RightTriangle :: getPerimeter");
      RightTriangle rightTriangle = new RightTriangle(10.0,4.0);
      assert(rightTriangle.getPerimeter() == 10.0 + 4.0+ Math.hypot(10.0,4.0));
   }
   
   public void testToString(){
      System.out.println("Testing RightTriangle :: toString");
      RightTriangle rightTriangle = new RightTriangle(10,4);
      assert(rightTriangle.toString().equals("The area of the right triangle is " +rightTriangle.getArea()
              +"\nThe Perimeter of the right triangle is "+rightTriangle.getPerimeter()));
   } 
   
   public static void main(String[] args){
      RightTriangleTest test = new RightTriangleTest();
      test.testArea();
      test.testPerimeter();
      test.testToString();
      System.out.println("All RightTriangle tests completed");
   }
}