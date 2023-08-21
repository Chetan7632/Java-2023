import java.util.*;
class InvlidAgeExc extends Exception
{
    public String toString()
    {
     return "Invalid Negative Age...";
    }
}
class Ex8
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Age:");
             int a=sc.nextInt();
            if(a<0)
              throw new InvalidAgeExc();
            if(a>=18)
              System.out.println("Voter");
            else
            System.out.println("You are not eligible for voting");
        }catch(Exception e)
        {
            System.out.println("Error="+e);
        }
    }
}