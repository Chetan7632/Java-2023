interface I1
{
    void area();
}
class Rectangle implements I1
{
    float l,b;
    Rectangle(float l,float b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        float a=l*b;
          System.out.println("Area of Rectangle="+a);
    }
}
class Square extends Rectangle
{
    float s;
    Square(float l,float b)
    {
        super(l,b);
        s=l;
    }
    public void area()
    {
        float a=s*s;
          System.out.println("Area of Square="+a);
          super.area();
    }
}
class Circle implements I1
{
    float r;
    Circle(float r)
    {
        this.r=r;
    }
    public void area()
    {
        float a=3.14f*r*r;
          System.out.println("Area of Circle="+a);
    }
}
class interf4
{
    public static void main(String arg[])
    {
        Square ob=new Square(5.8f,3.2f);
          ob.area();
        Circle ob1=new Circle(8.2f);
          ob1.area();
    }   
}