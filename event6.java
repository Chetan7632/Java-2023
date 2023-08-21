import java.awt.*;
import java.awt.event.*;
class event6 extends Frame implements FocusListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    event6()
    {
        setVisible(true);
        setSize(500,500);
        setTitle("Addition");
        setLocation(50,100);
        setBackground(Color.pink);
        setLayout(new FlowLayout());

         l1=new Label("Enter No1:");
         l2=new Label("Enter No2:");
         l3=new Label("Addition:");
         l4=new Label("Multiplication:");

         t1=new TextField(10);
         t2=new TextField(10);
         t3=new TextField(10);
         t4=new TextField(10);

         add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
         add(l4);add(t4);

         t1.addFocusListener(this);
         t2.addFocusListener(this);
         t3.addFocusListener(this);
         t4.addFocusListener(this);
    }
    public void FocusGained(FocusEvent fe)
    {
        if(fe.getSource()==t1)
         t1.setBackground(Color.yellow);
        if(fe.getSource()==t2)
         t1.setBackground(Color.red);
        if(fe.getSource()==t3)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            t3.setText(""+c);
        }
        if(fe.getSource()==t4)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a*b;
            t4.setText(""+c);
        }
    }
    public static void main(String arg[])
    {
       new event6();
    }
}