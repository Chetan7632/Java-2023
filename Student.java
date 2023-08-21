import java.util.*;
class Student
{
     int rno;
     String name;
     float per;
     Student()
     {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Roll No:");
               rno=sc.nextInt();
            System.out.println("Enter Name:");
               name=sc.next();
            System.out.println("Enter Per:");
            per=sc.nextFloat();
     }
     static void Sort_Student(Student ob[],int n)
     {
            int pass,i;
           Student t;
           for(pass=0;pass<n;pass++)
           {
                  for(i=0;i<n-pass;i++)
                  {
                          if(ob[i].per<ob[i+1].per)
                          {
                                   t=ob[i];
                                   ob[i]=ob[i+1];
                                   ob[i+1]=t;
                          }
                  }
           }
            for(i=0;i<n;i++)
            {
                  System.out.println(ob[i].rno+"\t"+ob[i].name+"\t"+ob[i].per);
            }
     }
    public static void main(String arg[])
    {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter Limit:");
               int n=sc.nextInt();
             Student ob[]=new Student[n];
              for(int i=0;i<n;i++)
              {
                     ob[i]=new Student();
              }
              Sort_Student(ob,n);
    }
}