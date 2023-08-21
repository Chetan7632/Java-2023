class A
{
     A()
     {
              System.out.println("I am default constructor of Base class A");
     }
}
class B extends A
{
       B()
       {
             System.out.println("I am default constructor of Derived class B");
       }
      public static void main(String arg[])
      {
                B ob=new B();
      }
}