import java.awt.*;
class awt9 extends Frame
{
    TextField t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,bequal;
    awt9()
    {
        setVisible(true);
        setSize(500,500);
        setTitle("Calculator");
        setLayout(new FlowLayout());
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        bdot=new Button(".");
        badd=new Button("+");
        bsub=new Button("-");
        bmul=new Button("*");
        bdiv=new Button("/");
        bequal=new Button("=");
       t1=new TextField(15);
       Panel p1=new Panel();
       p1.setLayout(new GridLayout(4,4,10,20));
       p1.add(b1);p1.add(b2);p1.add(b3);p1.add(badd);p1.add(b4);p1.add(b5);
       p1.add(b6);p1.add(bsub);p1.add(b7);p1.add(b8);p1.add(b9);p1.add(bmul);
       p1.add(b0); p1.add(bdot);p1.add(bequal);p1.add(bdiv);
       add(t1);
       add(p1);
    }
    public static void main(String arg[])
    {
        new awt9();
    }
}