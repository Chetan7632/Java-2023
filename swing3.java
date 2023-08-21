import javax.swing.*;
class swing3 extends JFrame
{
    JRadioButton b1;
    swing3()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        r1=new JRadioButton("java");
        r1.setBounds(100,50,120,40);
       add(r1); 
    }
    public static void main(String arg[])
    {
        new swing3();
    }
}