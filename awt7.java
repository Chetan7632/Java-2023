import java.awt.*;
class awt7 extends Frame
{
    Label l1,l2;
    Checkbox c1,c2,c3,c4,c5;
    CheckboxGroup cg,cg1;
    awt7()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(7,1));
        l1=new Label("Select Gender:");
        l2=new Label("Select Class:");

        cg=new CheckboxGroup();
        cg1=new CheckboxGroup();
        c1=new Checkbox("Male",cg,true);
        c2=new Checkbox("Female",cg1,false);
        c3=new Checkbox("FY",cg1,false);
        c4=new Checkbox("SY",cg1,false);
        c5=new Checkbox("TY",cg1,false);
        add(l1);
        add(c1);
        add(c2);
        add(l2);
        add(c3);
        add(c4);
        add(c5);
    }
    public static void main(String arg[])
    {
        new awt7();
    }
}