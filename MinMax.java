import java.util.*;
class MinMax
{
     public static void main(String arg[])
     {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter First Number:");
               int a=sc.nextInt();
            System.out.println("Enter Second Number:");
               int b=sc.nextInt();
            System.out.println("Enter Third Number:");
               int c=sc.nextInt();
                  if(a>b && a>c)
                      System.out.println("Maximum No="+a);
                  else if(b>a && b>c)
                      System.out.println("Maximum No="+b);
                  else if(c>a && c>b)
                      System.out.println("Maximum No="+c);
                  else
                      System.out.println("Number are Same");
    }
}