class A
{
     void add(int x,int y)
     {
            System.out.println("Addition1="+(x+y));
     }
}
class B extends A
{
     void add(int x,int y)
     {
          System.out.println("Addition2="+(x+y));
          super.add(x,y);
     }
}
public class super3
{
     public static void main(String arg[])
     {
              B ob=new B();
             ob.add(11,22);
     }
}