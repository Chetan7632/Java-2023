import java.awt.*;
class awt6 extends Frame
{
    Checkbox c1,c2;
    CheckboxGroup cg;
    awt6()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        cg=new CheckboxGroup();
        c1=new Checkbox("Male",cg,true);
        c2=new Checkbox("Female",cg,false);
       add(c1);
       add(c2);
    }
    public static void main(String arg[])
    {
        new awt6();
    }
}