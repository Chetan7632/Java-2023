import java.awt.*;
import java.awt.event.*;
class event9 extends Frame implements MouseListener,MouseMotionListener
{
    TextField t1;
    event9()
    {
        setVisible(true);
        setSize(500,500);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        t1=new TextField(30);
        add(t1);
        addMouseListener(this);
        addMouseMotionListener(this);
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
    public void mouseDragged(MouseEvent me)
    {}
    public void mouseMoved(MouseEvent me)
    {
        t1.setText("move X Position="+me.getX()+"Y Position="+me.getY());
    }
    public static void main(String arg[])
    {
        event9 ob=new event9();
    }
}