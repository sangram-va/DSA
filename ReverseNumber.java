class ReverseNumber
{
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverse(num));
    }
    public static int reverse(int x) 
    {
        boolean negativeNumber = x <0;
        String str = String.valueOf(Math.abs(x));
         String res = new StringBuilder(str).reverse().toString();
         try
         {
            int temp = Integer.parseInt(res);
            return negativeNumber?-temp:temp;
         }catch(Exception e)
         {
            return 0;
         }


    }
}