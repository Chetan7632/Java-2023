import java.util.*;
public class string4
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String1:");
     String s1=sc.nextLine();
     System.out.println("Enter String2:");
     String s2=sc.nextLine();
    int k=s1.compareTo(s2);
    if(k==0)
    	System.out.println("String are same");
    if(k>0)
    	System.out.println("String1 Greater");
    if(k<0)
    	System.out.println("String2 Greater");
  }
}
