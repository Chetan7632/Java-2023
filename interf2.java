interface Operation
{
    final float PI=3.142f;
    void area(float r,float h);
    void volume(float r,float h);
}
class Cylinder implements Operation
{
    public void area(float r,float h)
    {
        float a=2*PI*r*h+2*PI*r*r;
         System.out.println("Area of Cylinder="+a);
    }
    public void volume(float r,float h)
    {
        float a=PI*r*r*h;
         System.out.println("Volume of Cylinder="+a);
    }
}
class interf2
{
    public static void main(String arg[])
    {
        Cylinder ob=new Cylinder();
        ob.area(4.6f,3.7f);
        ob.volume(4.6f,3.7f);

    }
 }