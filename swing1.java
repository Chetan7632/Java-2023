import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class swing1 extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    swing1()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);

        l1=new JLabel("Addition Program");
        l1.setBounds(100,10,300,70);
        Font f1=new Font("Monospaced",Font.BOLD,25);
        l1.setFont(f1);
        l1.setForeground(Color.red);
        add(l1);

        l2=new JLabel("Enter No:");
        l2.setBounds(100,50,200,70);
        add(l2);

        t1=new JTextField();
        t1.setBounds(300,70,200,40);
        add(t1);
       b1=new JButton("Square");
       b1.addActionListener(this); 
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int n=Integer.parseInt(t1.getText());
            int s=n*n;
            JOptionPane.showMessageDialog(this,"Square="+s);
        }
    }
    public static void main(String arg[])
    {
        new swing1();
    }
}