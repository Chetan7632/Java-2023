import java.util.*;
abstract class Shape1
{
     abstract void calc_area();
     abstract void calc_volume();
}
class Sphere1 extends Shape1
{
      float r;
      Sphere1(float r)
      {
            this.r=r;
      }
      void calc_area()
      {
            float a=4*3.14f*r*r;
            System.out.println("Area of Sphere="+a); 
      }
      void calc_volume()
      {
             float a=4/3*3.14f*r*r*r;
             System.out.println("Volume of Sphere="+a);
      }
}
class Cone1 extends Shape1
{
     float r,h;
     Cone1(float r,float h)
     {
            this.r=r;
            this.h=h;
     }
     void calc_area()
     {
           double a=3.14f*r*(r+Math.sqrt(h*h)+Math.sqrt(r*r));
            System.out.println("Area of Cone="+a);
     }
    void calc_volume()
    {
           float a=0.5f*h*3.14f*r*r;
            System.out.println("Volume of Cone="+a);
    }
}
class abstract3
{
      public static void main(String arg[])
      {
            Sphere1 ob=new Sphere1(6.7f);
            Cone1 ob1=new Cone1(4.6f,8.3f);
            ob.calc_area();
            ob.calc_volume();
            ob1.calc_area();
            ob1.calc_volume();

      }
}