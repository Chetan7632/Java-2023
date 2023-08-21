import java.awt.*;
class awt8 extends Frame
{ 
   Choice ch1;
   awt8()
   {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());

    ch1=new Choice();
    ch1.add("Select Class");
    ch1.add("FY");
    ch1.add("SY");
    ch1.add("TY");
    add(ch1);
   }
   public static void main(String arg[])
   {
        new awt8();
   }
}