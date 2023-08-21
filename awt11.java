import java.awt.*;
class awt11 extends Frame
{
    TextArea ta;
    MenuBar mb;
    Menu file;
    MenuItem ne,open,save,saveas;
    awt11()
    {
        setVisible(true);
        setSize(1000,1000);
        ta=new TextArea();
        add(ta);

        mb=new MenuBar();
        file=new Menu("File");
        
        ne=new MenuItem("New");
        open=new MenuItem("Open");
        save=new MenuItem("Save");
        saveas=new MenuItem("Saveas");
         
        file.add(ne);
        file.add(open);
        file.add(save);
        file.add(saveas);

        mb.add(file);
         setMenuBar(mb);
    }
    public static void main(String arg[])
    {
        new awt11();
    }       
}