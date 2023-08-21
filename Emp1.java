import java.util.*;
class Emp1
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
         sal=sc.nextfloat();
   }
   void disp()
   {
        System.out.println(eno+"\t"+ename+"\t"+sal);
   }
  static void search_by_no(Emp ob[],int num,int n)
  {
       int flag=0;
            for(int i=0;i<n;i++)
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
                 System.out.println("Record not found.........");
  }
  static void search_by_name(Emp ob[],String s1,int n)
  {
       int flag=0,i;
            for(i=0;i<n;i++)
            {
                  if(ob[i].ename==s1)
                  {
                           flag=1;
                             break;
                   }
            }
            if(flag==1)
                ob[i].disp();
            else
                 System.out.println("Record not found.........");
  }
  void sort_by_name(Emp ob[],int n)
  {
       int i,pass;
            for(pass=0;pass<n;pass++)
           {
                 for(i=0;i<n-pass;i++)
                 {
                       if(ob[i].ename.compareTo(ob[i+1].ename)>0)
                       {
                            t=ob[i];
                            ob[i]=ob[i+1];
                            ob[i+1]=t;
                       }
                 }
           }
           for(i=0;i<n;i++)
               ob[i].disp();
   }
   public static void main(String arg[])
   {
          Emp ob[]=new Emp[100];
           int ch,i,n=0;
           Scanner sc=new Scanner(System.in);
           do
            {
                  System.out.println("1-Accept \n 2-disp \n 3-search by number");
                  System.out.println("4-search by name \n 5-sort by name");
                   System.out.println("Enter Choice:");
                   ch=sc.nextInt();
                   switch(ch)
                   {
                           case 1: System.out.println("Enter limit:");
                                      n=sc.nextInt();
                                       for(i=0;i<n;i++)
                                       {
                                             ob[i]=new Emp();
                                             ob[i].accept();
                                       }
                                       break;
                         case 2: for(i=0;i<n;i++)
                                     {
                                          ob[i].disp();
                                     }
                                      break;
                         case 3: System.out.println("Enter emp number to search:");
                                     int num=sc.nextInt();
                                     search_by_no(ob,num,n);
                                    break;
                        case 4: System.out.println("Enter emp name to search:");
                                     String s1=sc.next();
                                     search_by_no(ob,s1,n);
                                    break;
                        case 5: ob[0].sort_by_name(ob,n);
                                     break;
                        default: System.out.println("Invalid choice........");
                   }
            }while(ch<6);
   }
}