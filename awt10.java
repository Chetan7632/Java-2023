import java.awt.*;
class awt10 extends Frame
{
    TextArea ta;
    MenuBar mb;
    Menu file,edit,font,help;
    MenuItem ne,open,save,saveas,print,cut,copy,paste,selectall,size,color,contact;
    awt10()
    {
        setVisible(true);
        setSize(1000,1000);
        ta=new TextArea();
        add(ta);

        mb=new MenuBar();
        file=new Menu("File");
        edit=new Menu("Edit");
        font=new Menu("Font");
        help=new Menu("Help");

        ne=new MenuItem("New");
        open=new MenuItem("Open");
        save=new MenuItem("Save");
        saveas=new MenuItem("Saveas");
        print=new MenuItem("Print");
        cut=new MenuItem("Cut");
        copy=new MenuItem("Copy");
        paste=new MenuItem("Paste");
        selectall=new MenuItem("SelectAll");
        size=new MenuItem("Size");
        color=new MenuItem("Color");
        contact=new MenuItem("Contact Us");

        file.add(ne);
        file.add(open);
        file.add(save);
        file.add(saveas);
        file.add(print);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);
        edit.add(size);
        edit.add(color);
        edit.add(contact);

        mb.add(file);
        mb.add(edit);
        mb.add(font);
        mb.add(help);
       setMenuBar(mb);
    }
    public static void main(String arg[])
    {
        new awt10();
    }       
}