class Student5
{
     int rno;
     String name;
     float per;
      void accept(int rno1,String name1,Float per1)
      {
                 rno=rno1;
                 name=name1;
                 per=per1;
      }
      void disp()
      {
            System.out.println("Roll No="+rno);
            System.out.println("Name="+name);
            System.out.println("Percentage="+per);
      }
     public static void main(String arg[])
     {
               Student5 ob=new Student5();
               ob.accept(101,"om",66.77f);
               ob.disp();
     }
}