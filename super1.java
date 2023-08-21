class A
{
      int x=10;
}
class B extends A
{
     int x=20;
    void show()
    {
    System.out.println("Value1="+super.x);
    System.out.println("Value2="+x);
     super.x=55;
    System.out.println("Value3="+x);
    System.out.println("Value4="+super.x);
   }
}
public class super1
{
     public static void main(String arg[])
     {
              B ob=new B();
               ob.show();
     }
}