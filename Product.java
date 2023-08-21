import java.util.*;
class Product
{
      int pid,qty;
      float price,tot;
      String pname;
      void accept()
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Product Id:");
             pid=sc.nextInt();
            System.out.println("Enter Product Name:");
             pname=sc.next();
            System.out.println("Enter Product Price:");
             price=sc.nextFloat();
            System.out.println("Enter Product Qty:");
             qty=sc.nextInt();
      }
      void calc()
      {
              tot=qty*price;
      }
      void disp()
      {
             System.out.println("Product Id="+pid);
             System.out.println("Product Name="+pname);
             System.out.println("Product Price="+price);
             System.out.println("Product Qty="+qty);
             System.out.println("Product Total Amount="+tot);
      }
      public static void main(String arg[])
      {
              Product ob=new Product();
               ob.accept();
               ob.calc();
               ob.disp();
      }
}