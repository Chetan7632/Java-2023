class Ex1
{
    public static void main(String arg[])
    {
        try
        {
            int a[]=new int[5];
            a[0]=11;
            a[5]=33;

            System.out.println("Value="+a[3]);
        }catch(Exception e)
        {
            System.out.println("Error="+e);
        }

    }
}