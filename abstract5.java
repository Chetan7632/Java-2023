import java.util.*;
abstract class Staff
{
    protected int id;
    protected String name;
    Staff(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class OfficeStaff extends Staff
{
    String dept;
    OfficeStaff(int id,String name,String dept)
    {
        super(id,name);
        this.dept=dept;
    }
    void disp()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name); 
        System.out.println("Dept="+dept);       
    }
}
class abstract5
{
    public static void main(String[] arg)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
         n=sc.nextInt();
        OfficeStaff ob[]=new OfficeStaff[n];
         for(int i=0;i<n;i++)
         {
            System.out.println("Enter Id:");
             int id=sc.nextInt();
            System.out.println("Enter Name:");
             String name=sc.next();
            System.out.println("Enter Dept:");
             String dept=sc.next();
            ob[i]=new OfficeStaff(id,name,dept);
         }
         for(int i=0;i<n;i++)
         {
            ob[i].disp();
         }
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         