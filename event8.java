import java.awt.*;
import java.awt.event.*;
class event8 extends Frame implements MouseListener
{
    TextField t1;
    event8()
    {
        setVisible(true);
        setSize(500,500);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        t1=new TextField(30);
        add(t1);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        t1.setText("X Position="+me.getX()+"Y Position="+me.getY());
    }
    public void mousePressed(MouseEvent me)
    {}
    public void mouseReleased(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public static void main(String arg[])
    {
        event8 ob=new event8();
    }
}