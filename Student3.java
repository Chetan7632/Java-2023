import java.util.*;
class Student3
{
     int rno;
     String sname,sclass;
     Scanner sc=new Scanner(System.in);
    void accepts()
    {
           System.out.println("Enter Roll No:");
             rno=sc.nextInt();
           System.out.println("Enter Name:");
             sname=sc.next();
           System.out.println("Enter Class:");
             sclass=sc.next();
    } 
}
class Exam extends Student3
{
      int m[]=new int[6];
     void acceptmark()
     {
            System.out.println("Enter Six Subject Marks:");
                for(int i=0;i<6;i++)
                {
                        m[i]=sc.nextInt();
                }
     } 
}
class Result extends Exam
{
           int tot=0;
           float per;
           void calc()
           {
                 for(int i=0;i<6;i++)
                 {
                         tot=tot+m[i];
                 }
                  per=tot/6;
           }
           void disp()
           {
                System.out.println("Roll No="+rno);
                System.out.println("Name="+sname);
                System.out.println("Class="+sclass);
                System.out.println("Total Marks="+tot);
                System.out.println("Percentage="+per);
           }
           public static void main(String arg[])
           {
                  Result ob=new Result();
                  ob.accepts();
                  ob.acceptmark();
                  ob.calc();
                  ob.disp();
           }
}