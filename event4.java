import java.awt.*;
import java.awt.event.*;
class event4 extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6;
    Checkbox c1,c2,c3,c4,c5;
    TextField t1;
    CheckboxGroup cg;
    TextArea ta1,ta2;
    Choice ch1;
    Button b1,b2;
    event4()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        l1=new Label("Name:");
        l2=new Label("Address:");
        l3=new Label("Gender:");
        l4=new Label("Subjects:");
        l5=new Label("Class:");
        l6=new Label("Info:");

        cg=new CheckboxGroup();
        c1=new Checkbox("Male",cg,false);
        c2=new Checkbox("Female",cg,false);
        c3=new Checkbox("C Lang");
        c4=new Checkbox("C++");
        c5=new Checkbox("Java");
        ch1=new Choice();
         ch1.add("FY");
         ch1.add("SY");
         ch1.add("TY");
        ta1=new TextArea(3,40);
        ta2=new TextArea(5,50);
        t1=new TextField(10);
        b1=new Button("Submit");
        b2=new Button("Clear");

        add(l1);add(t1);add(l2);add(ta1);add(l3);add(c1);add(c2);add(l4);
        add(c3);add(c4);add(c5);add(l5);add(ch1);add(b1);add(b2);add(l6);add(ta2);
       b1.addActionListener(this);
       b2.addActionListener(this);
    }
    public void ActionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String name=t1.getText();
            String add=ta1.getText();
            String g="";
            if(c1.getState())
              g="Male";
            else
              g="Female";
            String s="";
            if(c3.getState())
              s="C lang";
            if(c4.getState())
              s=s+"C++";
            if(c5.getState())
              s=s+"Java";
            String c=ch1.getSelectedItem();
            ta2.append("Name="+name);
            ta2.append("\n Address="+add);
            ta2.append("\n Gender="+g);
            ta2.append("\n Subjects="+s);
            ta2.append("\n Class="+c);
        }
        if(ae.getSource()==b2)
        {
            t1.setText("");
            ta1.setText("");
            ta2.setText("");
            c1.setState("false");
            c2.setState("false");
            c3.setState("false");
            c4.setState("false");
            c5.setState("false");
        }
    }
    public static void main(String arg[])
    {
        new event4();
    }
 
}