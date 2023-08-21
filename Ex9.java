import java.util.*;
class SmallNumberException extends Exception
{
    public String toString()
    {
        return "Number is Small";
    }
}
class GreaterNumberException extends Exception
{
    public String toString()
    {
        return "Number is Greater";
    }
}
class Ex9
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number:");
              int n=sc.nextInt();
               if(n<5)
                 throw new SmallNumberException();
               if(n>10)
                 throw new GreaterNumberException();
            int f=1;
              for(int i=1;i<=n;i++)
                f=f*i;
                 System.out.println("Factorial="+f);
        }catch(SmallNumberException e1)
        {
            System.out.println("Error="+e1);
        }
        catch(GreaterNumberException e2)
        {
            System.out.println("Error="+e2);
        }
    }
}
