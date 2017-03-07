package edu.jalc.shape.ellipse;

class CircleTest{

   public void testArea(){
      System.out.println("Testing Circle :: getArea");
      Circle circle = new Circle(7);
      assert(circle.getArea() == Math.PI*(7*7));
   }
   
   public void testCircumference(){
      System.out.println("Testing Circle :: getCircumference");
      Circle circle = new Circle(7);
      assert(circle.getCircumference() == 2*Math.PI*7);
   }
   
   public void testToString(){
      System.out.println("Testing Circle :: toString");
      Circle circle = new Circle(7);
      assert(circle.toString().equals("The area of the Circle is " +circle.getArea() 
                                      +"\nThe circumference of the Circle is " +circle.getCircumference()));
   } 
   
   public static void main(String[] args){
      CircleTest test = new CircleTest();
      test.testArea();
      test.testCircumference();
      test.testToString();
      System.out.println("All Circle tests completed");
   }
}