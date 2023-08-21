import java.util.*;
class InvalidNameException extends Exception
{
    public String toString()
    {
        return "Invalid Name";
    }
}
class Ex13
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name:");
             String s1=sc.nextLine();
             for(int i=0;i<s1.length();i++)
             {
                if(!(Character.isLetter(s1.charAt(i))||s1.charAt(i)==' '))
                    throw new InvalidNameException();
             }
             System.out.println("Name="+s1);
        }catch(Exception e1)
        {
            System.out.println("Error="+e1);
        }
    }
}