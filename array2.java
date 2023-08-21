import java.util.*;
public class array2
{
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
               System.out.println("Enter limit:");
               int n=sc.nextInt();
               int a[]=new int [n];
               System.out.println("Enter n number:");
                for(int i=0;i<n;i++)
                    a[i]=sc.nextInt();
                  int s=0;
                 for(int i=0;i<n;i++)
                 {
                        if(a[i]%2==0)
                             s=s+a[i];
                 }
                System.out.println("Sum of Even Nos="+s);
       }
}