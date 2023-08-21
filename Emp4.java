class Emp4
{
     int eno;
     String ename;
     float sal;
     Emp4(int eno,String ename,float sal)
     {
           this.eno=eno;
           this.ename=ename;
           this.sal=sal;
     }
     void disp()
     {
           System.out.println("Emp No="+eno);
           System.out.println("Emp Name="+ename);
           System.out.println("Emp Sal="+sal);
     }
     public static void main(String arg[])
     {
               Emp4 ob=new Emp4(101,"om",66777.00f);
              ob.disp();
     }
}