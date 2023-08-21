class Emp2
{
     int eno;
     String ename;
     float sal;
     Emp2()
     {
           eno=10;
           ename="om";
           sal=98899;
     }
     void disp()
     {
           System.out.println("Emp No="+eno);
           System.out.println("Emp Name="+ename);
           System.out.println("Emp Sal="+sal);
     }
     public static void main(String arg[])
     {
               Emp2 ob=new Emp2();
              ob.disp();
     }
}