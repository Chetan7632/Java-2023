import java.util.*;
abstract class Shape
{
      Scanner sc=new Scanner(System.in);
      abstract void area();
}
class Rectangle extends Shape
{
      void area()
      {
             System.out.println("Enter Length:");
               float l=sc.nextFloat();
             System.out.println("Enter Breadth:");
               float b=sc.nextFloat();
              float a=l*b;
              System.out.println("Area of Rectangle="+a);             
      }  
}
class Triangle extends Shape
{
      void area()
      {
             System.out.println("Enter Base:");
               float b=sc.nextFloat();
             System.out.println("Enter Height:");
               float h=sc.nextFloat();
              float a=0.5f*b*h;
              System.out.println("Area of Triangle="+a);             
      } 
}
class abstract2
{
      public static void main(String arg[])
      {
             Rectangle ob=new Rectangle();
             ob.area();
             Triangle ob1=new Triangle();
             ob1.area();
      }
}