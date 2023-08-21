import java.util.*;
class Emp8array
{
     int eno;
     String ename;
     float sal;
      void accept()
      {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Emp No:");
            eno=sc.nextInt();
           System.out.println("Enter Emp Name:");
            ename=sc.next();
           System.out.println("Enter Emp Sal:");
            sal=sc.nextFloat();
      }
      void disp()
      {
          System.out.println("Emp No="+eno);
          System.out.println("Emp Name="+ename);
          System.out.println("Emp Sal="+sal);
      }
      public static void main(String arg[])
      {
            Emp8array ob[]=new Emp8array[100];
             int ch,i,n=0;
            Scanner sc=new Scanner(System.in);
             do
             {
                   System.out.println("1-Accept \n 2-disp \n 3-search by number");
                   System.out.println("Enter Choice:");
                     ch=sc.nextInt();
                       switch(ch)
                       {
                               case 1: System.out.println("Enter limit:");
                                          n=sc.nextInt();
                                           for(i=0;i<n;i++)
                                           {
                                                  ob[i]=new Emp8array();
                                                  ob[i].accept();
                                            }
                                           break;
                               case 2: for(i=0;i<n;i++)
                                            {
                                                  ob[i].disp();                                                 
                                             }
                               case 3: int flag=0;
                                            System.out.println("Enter Emp Number to Search:");
                                                int num=sc.nextInt();
                                               for(i=0;i<n;i++)
                                               {
                                                        if(ob[i].eno==num)
                                                        {
                                                                flag=1;
                                                                 break;
                                                         }
                                                }
                                                if(flag==1)
                                                   ob[i].disp();
                                                else
                                                   System.out.println("Record not found..........");
                                               break;
                             default: System.out.println("Invalid Choice.......");
                       }
              }while(ch>4);      
      }
}