class A
{
     A(int x,int y)
     {
            System.out.println("Addition="+(x+y));
     }
}
class B extends A
{
     B(int x,int y)
     {
          super(x,y);
          System.out.println("Addition="+(x+y));
     }
}
public class super2
{
     public static void main(String arg[])
     {
              B ob=new B(10,20);
     }
}