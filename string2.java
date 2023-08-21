import java.util.*;
public class string2
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String:");
     String s1=sc.nextLine();
     System.out.println("Alternate char=");
     for(int i=0;i<s1.length();i=i+2)
     {
    		 System.out.print(s1.charAt(i));
     }
  }
}
