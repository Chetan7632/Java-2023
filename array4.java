import java.util.*;
public class array4
{
     public static void main (String[] arg)
     {
            int a[][]=new int[2][2];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Matrix:");
              for(int i=0;i<2;i++)
                   for(int j=0;j<2;j++)
                        a[i][j]=sc.nextInt();
              System.out.println("Disp Matrix:\n");
               for(int i=0;i<2;i++)
               {
                      for(int j=0;j<2;j++)
                      {
                            System.out.println(a[j][i]+"\t");
                      }
                       System.out.println();
               }
     }
}