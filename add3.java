class A
{
    int a,b,c;
    A()
    {
            a=11;
            System.out.println("Addition1="+c);
    }
}
class B extends A
{
      B()
      {
           b=22;
           c=a+b;
           System.out.println("Addition2="+c);
      }
      public static void main(String arg[])
      {
           B ob=new B();
      }
}