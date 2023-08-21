import java.awt.*;
import java.awt.event.*;
class event10 extends Frame implements WindowListener
{
    event10()
    {
        setVisible(true);
        setSize(500,500);
       addWindowListener(this);
    }
    public void windowOpened(WindowEvent we)
    {
        setTitle("window opened");
    }
    public void windowClosed(WindowEvent we)
    {
        setTitle("window closed");
    }
    public void windowClosing(WindowEvent we)
    {
        //dispose();
        setTitle("window closing");
    }
    public void windowIconified(WindowEvent we)
    {
        setBackground(Color.red);
        setTitle("window Iconified");
    }
    public void windowDeiconified(WindowEvent we)
    {
        setBackground(Color.yellow);
        setTitle("window Deiconified");
    }
    public void windowAcivated(WindowEvent we)
    {
        setTitle("window Activated");
    }
    public void windowDeacivated(WindowEvent we)
    {
        setTitle("window Deactivated");
    }
    public static void main(String arg[])
    {
        event10 ob=new event10();
    }
}