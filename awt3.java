import java.awt.*;
class awt3 extends Frame
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    awt3()
    {
        setVisible(true);
        setSize(500,500);
        setTitle("Addition");
        setLocation(50,100);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        l1=new Label("Enter No1:");
        l2=new Label("Enter No2:");
        l3=new Label("Result:");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("OK");
        b2=new Button("Exit");
        add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
        add(b1);add(b2);
    }
    public static void main(String arg[])
    {
        awt3 ob=new awt3();
    }
}