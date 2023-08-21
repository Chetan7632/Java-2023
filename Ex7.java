class Ex7
{
    public static void main(String arg[])
    {
        int a=0,b=0,c=0,d=0;
        try
        {
            int n=5;
            a=n+10;;
            b=n-5;
            c=n/0;
            d=n*8;
        }catch(Exception e)
        {
            System.out.println("Error="+e);
        }
        finally
        {
            System.out.println("Addition="+a);
            System.out.println("Sub="+b);
            System.out.println("Multi="+c);
            System.out.println("Div="+d);
        }
    }
}