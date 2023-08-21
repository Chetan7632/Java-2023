import java.util.*;
public class StringBuf1
{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String1:");
       String s1=sc.next();
      StringBuffer sbr=new StringBuffer(s1);
         sbr.reverse();
      System.out.println("Reverse String="+sbr);
    }
}