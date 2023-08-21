import java.util.*;
class Emp5
{
      int eno;
      String ename;
      float sal;
      Emp5(int eno,String ename,float sal)
      {
            this.eno=eno;
            this.ename=ename;
            this.sal=sal;
      }
      void disp()
      {
           System.out.println("Emp no="+eno);
           System.out.println("Emp name="+ename);
           System.out.println("Emp sal="+sal);
      }
      public static void main(String arg[])
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Emp no:");
              int eno=sc.nextInt();
            System.out.println("Enter Emp Name:");
             String ename=sc.next();
            System.out.println("Enter Emp sal:");
             float sal=sc.nextFloat();
           
            Emp5 ob=new Emp5(eno,ename,sal);
            ob.disp();
      }
}