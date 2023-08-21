class this1
{
        int a=10;
        void show()
         {
                 int a=20;
                  System.out.println("Value1="+this.a);
                  System.out.println("Value2="+a);
                   this.a=99;
                  System.out.println("Value3="+a);
                  System.out.println("Value4="+this.a);
         }
         public static void main(String arg[])
         {
                 this1 ob=new this1();
                  ob.show();
         }
}