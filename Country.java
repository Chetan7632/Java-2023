import java.util.*;
class Country
{
     String cname;
     Scanner sc=new Scanner(System.in);
     void acceptc()
     {
           System.out.println("Enter Country Name:");
             cname=sc.next();
     }
}
class State extends Country
{
       String sname;
      void accepts()
      {
           System.out.println("Enter State Name:");
             sname=sc.next();
      }
}
class City extends State
{
        String area,cityname;
         void accept()
         {
                System.out.println("Enter Area:");
                   area=sc.next();
                System.out.println("Enter City Name:");
                   cityname=sc.next();
         }
        void disp()
         {
               System.out.println("Country Name="+cname);
               System.out.println("State Name="+sname);
               System.out.println("Area="+area);
               System.out.println("City Name="+cityname);
         }
         public static void main(String arg[])
         {
               City ob=new City();
               ob.acceptc();
               ob.accepts();
               ob.accept();
               ob.disp();
         }
}