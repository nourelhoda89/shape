 package edu.jalc.shape.rectangle;
 
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape; 

public final class ToSquare extends Square{

private static ToSquare instance = new ToSquare();
  
  private ToSquare(){
  super(0.0);
  }
  public static ToSquare getInstance(){
    if (instance == null){ instance = new ToSquare();}
      return instance;
   }
  public Square toSquare(TwoDimensionalShape shape){
      double length=Math.sqrt(shape.getArea()/Math.PI);
      return new Square(length);
   }
}