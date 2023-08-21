import java.awt.*;
import java.awt.event.*;
class event7 extends Frame implements MouseListener
{
    Label l1;
    event7()
    {
        setVisible(true);
        setSize(500,500);
        setBackground(Color.orange);
        setLayout(new FlowLayout());
        l1=new Label("This is Mouse is Mouse event Message");
        add(l1);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        l1.setText("Mouse Clicked Event");
    }
    public void mousePressed(MouseEvent me)
    {
        l1.setText("Mouse Pressed Event");
    }
    public void mouseReleased(MouseEvent me)
    {
        l1.setText("Mouse Released Event");
    }
    public void mouseEntered(MouseEvent me)
    {
        l1.setText("Mouse Entered Event");
    }public void mouseExited(MouseEvent me)
    {
        l1.setText("Mouse Exited Event");
    }
    public static void main(String arg[])
    {
        event7 ob=new event7();
    }
}