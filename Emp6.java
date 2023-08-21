import java.util.*;
class Emp6
{
      Static int cnt;
       int eno;
       String ename,dname;
       float sal;
      Emp6()
      {
             eno=11;
             ename="aman";
             sal=44545;
             dname="sales";
      }
     Emp6(int eno,String ename,float sal,String dname)
     {
           cnt++;
          System.out.println("Object Count="+cnt);
           this.eno=eno;
           this.ename=ename;
           this.sal=sal;
           this.dname=dname;
     }
     void disp()
     {
           System.out.println("Emp No="+eno);
           System.out.println("Emp Name="+ename);
           System.out.println("Emp Sal="+sal);
           System.out.println("Dept Name="+dname);
     }
     public static void main(String arg[])
     {
          Emp6 ob=new Emp6(101,"om",50000,"Computer");
          Emp6 ob=new Emp6(102,"sai",70000,"Account");
          Emp6 ob=new Emp6(104,"ram",30000,"Computer");

          ob.disp();
          ob1.disp();
          ob2.disp();
     }
}