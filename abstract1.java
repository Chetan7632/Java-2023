import java.util.*;
abstract class A
{
     abstract void add(int a,int b);
     abstract void square(int n);
      void cube(int n)
      {
               System.out.println("Cube="+(n*n*n));
      }
}
class B extends A
{
     void square(int n)
     {
            System.out.println("Square="+(n*n));
     }
     void add(int a,int b)
     {
           int c=a+b;
           System.out.println("Addition="+c);
     }
}
class abstract1
{
     public static void main(String arg[])
     {
        B ob=new B();
        ob.add(11,22);
        ob.square(4);
        ob.cube(5);
      }
}
