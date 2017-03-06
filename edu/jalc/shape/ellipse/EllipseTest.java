package edu.jalc.shape.ellipse;

class EllipseTest{

   public void testArea(){
      System.out.println("Testing Ellipse :: getArea");
      Ellipse ellipse = new Ellipse(4,5);
      assert(ellipse.getArea() == Math.PI*(4*5));
   }
   
   public void testCircumference(){
      System.out.println("Testing Ellipse :: getCircumference");
      Ellipse ellipse = new Ellipse(4,5);
      assert(ellipse.getCircumference() == 2*Math.PI*Math.sqrt((4.0+5.0)/2));
   }
   
   public void testToString(){
      System.out.println("Testing Ellipse :: ToString");
      Ellipse ellipse = new Ellipse(4,5);
      assert(ellipse.toString().equals("The area of the  Ellipse is " +ellipse.getArea() +"\nThe circumference of the Ellipse is "+ellipse.getCircumference()));
   } 
   
   public static void main(String[] args){
      EllipseTest test = new EllipseTest();
      test.testArea();
      test.testCircumference();
      test.testToString();
      System.out.println("All ellipse test completed");
   }
}