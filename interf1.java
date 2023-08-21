interface I1
{
    void add(int a,int b);
    void square(int n);
}
interface I2
{
    void leap(int y);
}
class Demo implements I1,I2
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition="+c);
    }
    public void square(int n)
    {
        int c=n*n;
        System.out.println("Square="+c);
    }
    public void leap(int y)
    {
        if(y%4==0)
         System.out.println("Leap Year");
        else
         System.out.println("Not Leap Year");
    }   
}
class interf1
{
    public static void main(String arg[])
    {
        Demo ob=new Demo();
        ob.add(11,22);
        ob.square(5);
        ob.leap(2024);
    }
}