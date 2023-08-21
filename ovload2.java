class ovload2
{
       void Add(int a,int b)
       {
             int c=a+b;
              System.out.println("Addition="+c);
       }
       void Add(double a,double b)
       {
             double c=a+b;
              System.out.println("Addition="+c);
       }
       void Add(float a,float b)
       {
             float c=a+b;
              System.out.println("Addition="+c);
       }
           public static void main(String arg[])
       {
                ovload2 ob=new ovload2();
                ob.Add(11,22);
                ob.Add(11.20f,33.11f);
                ob.Add(6.5,3.2);
       }
}