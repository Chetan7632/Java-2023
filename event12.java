import java.awt.*;
import java.awt.event.*;
class event12 extends Frame implements TextListener
{
    TextField t1,t2,t3;
    event12()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
         t1=new TextField(10);
         t2=new TextField(10);
         t3=new TextField(10);
        add(t1);add(t2);add(t3);
        t3.addTextListener(this);
    }
    public void textValueChanged(TextEvent te)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        t3.setText(""+c);
        t3.setBackground(Color.yellow);
    }
    public static void main(String arg[])
    {
        new event12();
    }
}