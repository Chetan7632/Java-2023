import java.util.*;
public class string3
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String1:");
     String s1=sc.nextLine();
     System.out.println("Enter String2:");
     String s2=sc.nextLine();
     if(s1.equalsIgnoreCase(s2))
    	 System.out.println("String are same");
     else
    	 System.out.println("String are not same");
  }
}
