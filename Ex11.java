import java.util.*;
class CovidException extends Exception
{
    public String toString()
    {
        return "Parent is Covid +ve & need to Hospitalised";
    }
}
class Ex11
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name:");
             String name=sc.next();
            System.out.println("Enter Age:");
             int age=sc.nextInt();
            System.out.println("Enter Oxy Level:");
             int oxy=sc.nextInt();
            System.out.println("Enter HRCT in Score:");
             int hrct=sc.nextInt();
               if(oxy<=95 && hrct>=10)
                   throw new CovidException();
            System.out.println("Patient Name="+name);
            System.out.println("Patient Age="+age);
            System.out.println("Patient Oxy Level="+oxy);
            System.out.println("Patient HRCT Score="+hrct);
        }catch(Exception e1)
        {
            System.out.println("Error="+e1);
        }
    }
}