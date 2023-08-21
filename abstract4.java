import java.util.*;
abstract class Staff
{
    String name,add;
    Staff(String name,String add)
    {
        this.name=name;
        this.add=add;
    }
    abstract void disp();
}
class FullTime extends Staff
{
    int sal;
    String dept;
    FullTime(String name,String add,int sal,String dept)
    {
        super(name,add);
        this.sal=sal;
        this.dept=dept;
    }
    void disp()
    {
        System.out.println("Name="+name);
        System.out.println("Address="+add);        
        System.out.println("Salary="+sal);
        System.out.println("Dept="+dept);
    }
}
class PartTime extends Staff
{
    int hours,rate;
    String dept;
    PartTime(String name,String add,int hours,int rate)
    {
        super(name,add);
        this.hours=hours;
        this.rate=rate;
    }
    void disp()
    {
        System.out.println("Name="+name);
        System.out.println("Address="+add);        
        System.out.println("No of Hours="+hours);
        System.out.println("Rate Per Hours"+rate);
        System.out.println("Salary="+(hours*rate));
    }
}
class abstract4
{
    public static void main(String arg[])
    {
        int ch,i;
        Scanner sc=new Scanner(System.in);
        FullTime ob[]=new FullTime[10];
        PartTime ob1[]=new PartTime[10];
        do
        {
            System.out.println("1-FullTime  2-PartTime:");
            ch=sc.nextInt();
             switch(ch)
             {
                case 1: System.out.println("Enter limit:");
                        int n=sc.nextInt();
                        for(i=0;i<n;i++)
                        {
                            System.out.println("Enter Name:");
                            String name=sc.next();
                            System.out.println("Enter Address:");
                            String add=sc.next();
                            System.out.println("Enter Sal:");
                            int sal=sc.nextInt();
                            System.out.println("Enter Dept:");
                            String dept=sc.next();
                            ob[i]=new FullTime(name,add,sal,dept);                                                                                    
                        }
                        for(i=0;i<n;i++)
                        {
                            ob[i].disp();
                        }
                        break;
                case 2: System.out.println("Enter limit:");
                         n=sc.nextInt();
                        for(i=0;i<n;i++)
                        {
                            System.out.println("Enter Name:");
                            String name=sc.next();
                            System.out.println("Enter Address:");
                            String add=sc.next();
                            System.out.println("Enter Hours:");
                            int hours=sc.nextInt();
                            System.out.println("Enter Hours Per Rate:");
                            int rate=sc.nextInt();
                            ob1[i]=new PartTime(name,add,hours,rate);                                                                                    
                        }
                        for(i=0;i<n;i++)
                        {
                            ob1[i].disp();
                        }
                        break;
             }
        }while(ch<3);
    }
}