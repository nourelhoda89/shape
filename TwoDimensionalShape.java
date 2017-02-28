package shape;

abstract public class TwoDimensionalShape {
   private double area;
   private double perimeter;
   
   private TwoDimensionalShape(){
      this.area=0;
      this.perimeter=0;
   }
   public TwoDimensionalShape(double area,double perimeter){
      this.area=area;
      this.perimeter=perimeter;
   }
   public String toString(){
      return "area is " +this.area +", perimeter is " + this.perimeter;
   }
}