import java.util.*;
abstract class Order
{
    int id;
    String desc;
    Scanner sc=new Scanner(System.in);
    abstract void accept();
    abstract void disp();
}
class PurchaseOrder extends Order
{
    String cname;
    void accept()
    {
        System.out.println("Enter Id:");
         id=sc.nextInt();
        System.out.println("Enter Desc:");
         desc=sc.next();
        System.out.println("Enter Customer Name:");
         cname=sc.next();
    }
    void disp()
    {
        System.out.println("Id="+id);
        System.out.println("Desc="+desc); 
        System.out.println("Customer Name="+cname);       
    }
}
class SalesOrder extends Order
{
    String vname;
    void accept()
    {
        System.out.println("Enter Id:");
         id=sc.nextInt();
        System.out.println("Enter Desc:");
         desc=sc.next();
        System.out.println("Enter Vender Name:");
         vname=sc.next();
    }
    void disp()
    {
        System.out.println("Id="+id);
        System.out.println("Desc="+desc); 
        System.out.println("Vender Name="+vname);       
    }
}
class abstract6
{
    public static void main(String[] arg)
    {
        PurchaseOrder p1,p2,p3;
        p1=new PurchaseOrder();
        p2=new PurchaseOrder();
        p3=new PurchaseOrder();
        p1.accept();
        p2.accept();
        p3.accept();
        p1.disp();
        p2.disp();
        p3.disp();

        SalesOrder s1=new SalesOrder();
        SalesOrder s2=new SalesOrder();
        SalesOrder s3=new SalesOrder();
        s1.accept();
        s2.accept();
        s3.accept();
        s1.disp();
        s2.disp();
        s3.disp();
    }
}