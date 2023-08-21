import java.util.*;
public class array3
{
    public static void main(String[] arg)
    {
       int a[]=new int[100];
        int j=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter limit:");
         int n=sc.nextInt();
       System.out.println("Enter n Number:");
          for(int i=0;i<n;i++)
          {
                 int num=sc.nextInt();
                 int num1=num;
                 int s=0;
                 while(num>0)
                 {
                           int d=num%10;
                           s=s+d*d*d;
                           num=num/10;
                  }
                 if(num1==5)
                 {
                        a[j++]=num1;
                 }
           }
           System.out.println("Armstrong Numbers:");
            for(int i=0;i<j;i++)
               System.out.println(a[i]);
   }
}