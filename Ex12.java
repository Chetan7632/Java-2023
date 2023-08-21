import java.util.*;
class InvalidDateException extends Exception
{
    public String toString()
    {
        return "Invalid Date...";
    }
}
class Ex12
{
    int dd,mm,yy;
    void accept()
    {
        try
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter dd mm yy:");
            dd=sc.nextInt();
            mm=sc.nextInt();
            yy=sc.nextInt();
          if(mm>12)
            throw new InvalidDateException();
          if((mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)&&(dd>31))
            throw new InvalidDateException();
          if((mm==4||mm==6||mm==9||mm==11)&& dd>30)
            throw new InvalidDateException();
          if(mm==2 && dd>28)
            throw new InvalidDateException();
           disp();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void disp()
    {
        System.out.println("Date="+dd+"/"+mm+"/"+yy);
    }
    public static void main(String arg[])
    {
        Ex12 ob=new Ex12();
         ob.accept();
    }
}