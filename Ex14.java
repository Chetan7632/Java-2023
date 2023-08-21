import java.util.*;
class Ex14
{
    public static void main(String arg[])throws Exception
    {
        DataInputStream din=new DataInputStream(System.in);
        System.out.println("Enter Name:");
        String s1=din.readline();
        System.out.println("Name="+s1);
    }
}