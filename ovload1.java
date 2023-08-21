class ovload1
{
       void area(float r)
       {
             float a=3.14f*r*r;
              System.out.println("Area of Circle="+a);
       }
       void area(double l,double b)
       {
             double a=l*b;
              System.out.println("Area of Ract="+a);
       }
       void area(float b,float h)
       {
             float a=0.5f*b*h;
              System.out.println("Area of Triangle="+a);
       }
       void area(int s)
       {
             int a=s*s;
              System.out.println("Area of Squre="+a);
       }
       public static void main(String arg[])
       {
                ovload1 ob=new ovload1();
                ob.area(5.4f);
                ob.area(4.3,7.6);
                ob.area(6.5f,3.2f);
                ob.area(5);
       }
}