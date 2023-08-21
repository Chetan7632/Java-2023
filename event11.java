import java.awt.*;
import java.awt.event.*;
class event11 extends Frame implements ActionListener
{
    Button b1,b2;
    event11()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        b1=new Button("RED");
        b2=new Button("BULE");              
        add(b1);add(b2);
       b1.addActionListener(this);
       b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            setBackground(Color.red);
        }
        if(ae.getSource()==b2)
        {
            setBackground(Color.blue);
        }
    }
    public static void main(String arg[])
    {
        event11 ob=new event11();
    }
}