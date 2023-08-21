import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class swing5 extends JFrame implements AdjustmentListener
{
    JTextField t1;
    JScrollBar js1;
    swing5()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        t1=new JTextField(10);
        t1.setBounds(100,50,100,40);
        add(t1);
        js1=new JScrollBar();
        js1.setMinimum(0);
        js1.setMaximum(100);
        js1.setOrientation(JScrollBar.HORIZONTAL);
        js1.setBounds(10,100,300,40);
        add(js1);
        js1.addAdjustmentListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        t1.setText(""+js1.getValue());
    }
    public static void main(String arg[])
    {
        new swing5();

    }
}