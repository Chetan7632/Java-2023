import java.util.*;
class Student2
{
     int rno;
     String name,email;
     float per;
     Scanner sc=new Scanner(System.in);
    void accepts()
    {
           System.out.println("Enter Roll No:");
             rno=sc.nextInt();
           System.out.println("Enter Name:");
             name=sc.next();
           System.out.println("Enter Per:");
             per=sc.nextFloat();
           System.out.println("Enter Email:");
             email=sc.next();
    } 
}
class Emp7 extends Student2
{
        int eno;
        String desig;
        float sal;
       void accepte()
       {
           System.out.println("Enter Emp No:");
             eno=sc.nextInt();
           System.out.println("Enter Designation:");
             desig=sc.next();
           System.out.println("Enter Sal:");
             sal=sc.nextFloat();
       }
       void disp()
      {
               System.out.println("Emp No="+eno);
               System.out.println("Emp Name="+name);
               System.out.println("Emp Email="+email);
               System.out.println("Emp Desig="+desig);
               System.out.println("Emp Sal="+sal);
      }
      public static void main(String arg[])
      {
               Emp7 ob=new Emp7();
               ob.accepts();
               ob.accepte();
               ob.disp();
      }
}