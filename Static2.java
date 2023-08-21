class Static2
{
     static void show()
     {
            int a=5;
             a++;
            System.out.println("Value="+a);
     }
    public static void main(String arg[])
    {
            Static2 ob=new Static2();
             ob.show();
             ob.show();
    }
}