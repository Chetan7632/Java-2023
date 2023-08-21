class Ex3
{
    public static void main(String arg[])
    {
        try
        {
            int a[]=new int[-5];
        }catch(Exception e)
        {
            System.out.println("Error="+e);
        }

    }
}