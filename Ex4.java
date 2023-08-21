class Ex4
{
    public static void main(String arg[])
    {
        try
        {
            int a=10;;
            int b=a+5;
            int c=a*0;
            int d=a/0;
              System.out.println("Addition="+b);
              System.out.println("Multi="+c);
              System.out.println("Div="+d);
        }catch(Exception e)
        {
            System.out.println("Error="+e);
        }

    }
}