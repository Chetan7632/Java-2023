interface Shape
{
    final float PI=3.142f;
    void area(float r);
}
class Circle implements Shape
{
    public void area(float r)
    {
        float a=3.142f*r*r;
         System.out.println("Area of Circle="+a);
    }
}
class Sphere implements Shape
{
    public void area(float r)
    {
        float a=4/3*3.142f*r*r;
         System.out.println("Area of Sphere="+a);
    }
}
class interf3
{
    public static void main(String arg[])
    {
        Circle ob=new Circle();
         ob.area(3.11f);
        Sphere ob1=new Sphere();
         ob1.area(4.2f);
    }
 }