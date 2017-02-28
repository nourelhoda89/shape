package shape;

public class Rectangle extends TwoDimensionalShape{
   private double height;
   private double width;
   
   private Rectangle(){
      this.height=0;
      this.width=0;
   }
   public Rectangle(double height,double width){
      this.height=height;
      this.width=width;
   }
   public double area(){
      return height*width;
   
   }
   public double perimeter(){
      return 2*height+2*width;
   }
   
// human readable toString method detailing their properties.
   public String toString(){
      return "The area of the rectangle is " +area() +" and the perimeter of the rectangle is "+perimeter();
   
   }
   //just to check will delete later
   public static void main(String[] args){
      Rectangle rectangle = new Rectangle(5,2);
      System.out.println(rectangle.toString());
   
   }
}
