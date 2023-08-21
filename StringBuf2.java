
public class StringBuf2
{
    public static void main(String arg[])
    {
            String s1="Shrirampur";
            StringBuffer sbr=new StringBuffer(s1);
            sbr.delete(3,7);
            System.out.println("Append String="+sbr);
    }
}