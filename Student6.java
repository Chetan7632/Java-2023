import java.util.*;
class Student6
{
     int rno;
     String name;
     float per;
      void accept(int rno1,String name1,Float per1)
      {
                 rno=rno1;
                 name=name1;
                 per=per1;
      }
      void disp()
      {
            System.out.println("Roll No="+rno);
            System.out.println("Name="+name);
            System.out.println("Percentage="+per);
      }
     public static void main(String arg[])
     {
               Student6 ob=new Student6();
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Roll No:");
                int rno=sc.nextInt();
               System.out.println("Enter Name:");
                String name=sc.next();
               System.out.println("Enter Percentage:");
                float per=sc.nextFloat();
                 ob.accept(rno,name,per);
                 ob.disp();
     }
}