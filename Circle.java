package shape;
/*compute their area and perimeter (circumference) via proper inheritance*/

public class Circle extends Ellipse{
   private double radius,area;
   
   private Circle(){
      this.radius=0;
       this.area=0;
   }
   public Circle(double radius){
   this.radius=radius;
   }
   public double areaCircle(double radius){
   area=Math.PI*radius;
   }
   






// human readable toString method detailing their properties. 

//equals method,must be able to compare any TwoDimensionalShape 
//to see if their areas are equal.
}
