import java.util.*;
class InvalidDataException extends Exception
{
    public String toString()
    {
        return "Invalid PAN Number or Mobile Number";
    }
}
class Ex10
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Mobile Number:");
             int mno=sc.nextInt();
            String s=" "+mno;
             if(s.length()!=10)
                throw new InvalidDataException();
             System.out.println("Mobile Number="+mno);
             System.out.println("Enter PAN Number:");
              String s1=sc.next();
               if(s1.length()!=10)
                 throw new InvalidDataException();
                for(int i=0;i<=4;i++)
                {
                    if(!Character.isDigit(s1.charAt(i)))
                       throw new InvalidDataException();
                }
                if(!Character.isUpperCase(s1.charAt(9)))
                    throw new InvalidDataException();
                 System.out.println("PAN Number="+s1);
        }catch(Exception e1)
        {
            System.out.println("Error="+e1);
        }
    }
}