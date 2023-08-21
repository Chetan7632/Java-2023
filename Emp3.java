import java.util.*;
class Emp3
{
      int eno;
      String ename;
      float sal;
      Emp3()
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Emp no:");
             eno=sc.nextInt();
            System.out.println("Enter Emp Name:");
             ename=sc.next();
            System.out.println("Enter Emp sal:");
             sal=sc.nextFloat();
      }
      void disp()
      {
           System.out.println("Emp no="+eno);
           System.out.println("Emp name="+ename);
           System.out.println("Emp sal="+sal);
      }
      public static void main(String arg[])
      {
                Emp3 ob=new Emp3();
               ob.disp();
      }
}