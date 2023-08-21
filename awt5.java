import java.awt.*;
class awt5 extends Frame
{ 
   Checkbox c1,c2,c3,c4;
   awt5()
   {
    setVisible(true);
    setSize(500,500);
    setLayout(new GridLayout(4,1));

    c1=new Checkbox("Java");
    c2=new Checkbox("PHP");
    c3=new Checkbox("Python");
    c4=new Checkbox("TCS");
    add(c1);
    add(c2);
    add(c3);
    add(c4);
   }
   public static void main(String arg[])
   {
        new awt5();
   }
}