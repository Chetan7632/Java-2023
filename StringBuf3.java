import java.util.*;
public class StringBuf3
{
      public static void main(String[] arg)
      {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter String1:");
               String s1=sc.nextLine();
               String s2[]=s1.split(" ");
                 for(int i=0;i<s2.length;i++)
                 {
                        StringBuffer sbr=new StringBuffer(s2[i]);
                          sbr.reverse();
                          System.out.print(sbr +" ");
                 } 
      }
}