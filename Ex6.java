class Ex6
{
    public static void main(String arg[])
    {
        try
        {
            int b[]=new int[-5];
            int a[]=new int[5];
            a[7]=33;
        }
        catch(ArithmeticException e1)
        {
            System.out.println("Error1="+e1);
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("ArrayIndexOutOfBoundException="+e2);
        }
        catch(NegativeArraySizeException e3)
        {
            System.out.println("NegetiveArraySizeException="+e3);
        }

    }
}