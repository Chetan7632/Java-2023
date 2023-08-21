import javax.swing.*;
class swing2 extends JFrame
{
    JCheckbox c1;
    swing2()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        c1=new JCheckbox("java");
        c1.setBounds(100,50,120.40);
       add(c1); 
    }
    public static void main(String arg[])
    {
        new swing2();
    }
}