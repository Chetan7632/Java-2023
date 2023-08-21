class MyNumber
{
     private int n;
      MyNumber()
     {
           n=0;
     }
     MyNumber(int n)
     {
            this.n=n;
     }
     boolean isNegetive()
     {
           if(n<0)
               return true;
           else
               return false;
     }
     boolean isPositive()
     {
           if(n>0)
               return true;
           else
               return false;
     }
    boolean isZero()
     {
           if(n==0)
               return true;
           else
               return false;
     }
   boolean isEven()
     {
           if(n%2==0)
               return true;
           else
               return false;
     }
   boolean isOdd()
   {
           if(n%2!=0)
               return true;
           else
               return false;
    }
   public static void main(String arg[])
   {
          MyNumber ob=new MyNumber(-77);
          if(ob.isNegetive())
              System.out.println("Number is -ve");
          if(ob.isPositive())
              System.out.println("Number is +ve");
          if(ob.isZero())
              System.out.println("Number is 0");
          if(ob.isEven())
              System.out.println("Number is Even");
          if(ob.isOdd())
              System.out.println("Number is Odd");
   }
}