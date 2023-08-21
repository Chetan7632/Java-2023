class Static1
{
        static int a=5;
        void show()
        {
             System.out.println("Value1="+a);
        }
        public static void main(String arg[])
        {
               System.out.println("I an Main...");
               System.out.println("Value2="+a);

              Static1 ob=new Static1();
              ob.show();
        }
}