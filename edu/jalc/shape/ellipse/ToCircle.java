 package edu.jalc.shape.ellipse;
 
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape; 

public final class ToCircle extends Circle{

private static ToCircle instance = new ToCircle();
  
  private ToCircle(){
  super(0.0);
  }
  public static ToCircle getInstance(){
    if (instance == null){ instance = new ToCircle();}
      return instance;
   }
  public Circle toCircle(TwoDimensionalShape shape){
      double radius=Math.sqrt(shape.getArea()/Math.PI);
      return new Circle(radius);
   }
}