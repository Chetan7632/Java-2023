class Static3
{
     static int c;
     static void add(int a,int b)
     {
           c=a+b;  
            System.out.println("Addition="+c);
     }
    public static void main(String arg[])
    {
            Static3 ob=new Static3();
             ob.add(11,22);
    
             Static3.add(33,44);

             add(66,11);
    }
}