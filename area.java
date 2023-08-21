class area
{
        void add(int a,int b)
        {
              int c=a+b;
              System.out.println("Addition="+c);
        }
       void square(int n)
        {
              int s=n*n;
              System.out.println("Square="+s);
        }
        public static void main(String arg[])
        {
               area ob=new area();
               ob.add(11,44);
               ob.square(5);
        }
}