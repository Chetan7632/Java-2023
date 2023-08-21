import java.util.*;
class College
{
       int cphno;
       String cname,caddr;
      Scanner sc=new Scanner(System.in);
     void acceptc()
     {
           System.out.println("Enter College Name:");
              cname=sc.next();
           System.out.println("Enter College Address:");
              caddr=sc.next();
           System.out.println("Enter College Phone No:");
              cphno=sc.nextInt();
     }
}
class Teacher extends College
{
         int tno;
         String tname,quali;
         void acceptt()
        {
           System.out.println("Enter Teacher No:");
              tno=sc.nextInt();
           System.out.println("Enter Teacher Name:");
              tname=sc.next();
           System.out.println("Enter Qualification:");
              quali=sc.next();
        }
       void dispt()
       {
               System.out.println("Teacher No="+tno);
               System.out.println("Teacher Name="+tname);            
               System.out.println("Qualification="+quali);
               System.out.println("College Name="+cname);
               System.out.println("College Address="+caddr);
               System.out.println("College Phone No="+cphno);
       }
     public static void main(String arg[])
      {
                Teacher ob1=new Teacher();
                ob1.acceptc();
                ob1.acceptt();
                ob1.dispt();
      }

}
class Student4 extends Teacher
{
         int rno;
         String sname;
         float per;
         void accepts()
        {
           System.out.println("Enter Roll No:");
              rno=sc.nextInt();
           System.out.println("Enter Student Name:");
              sname=sc.next();
           System.out.println("Enter Percentage:");
              per=sc.nextFloat();
        }
       void disps()
       {
               System.out.println("Roll No="+rno);
               System.out.println("Student Name="+sname);            
               System.out.println("Percentage="+per);
               System.out.println("College Name="+cname);
               System.out.println("College Address="+caddr);
               System.out.println("College Phone No="+cphno);
       }
       public static void main(String arg[])
      {
                Student4 ob2=new Student4();
                ob2.acceptc();
                ob2.accepts();
                ob2.disps();
      }
}