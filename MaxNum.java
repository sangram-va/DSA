class MaxNum
{
    public static void main(String[] args)
    {
        int [] arr = {4,6,98,3,56,100};
        int max = Integer.MIN_VALUE; // you can take max = 0 as well but Integer.MIN_VALUE is the optimised approach
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i]) max = arr[i];
            // example if arr[i] has 98 which is greater than 4 so we are replacing 
            // max = 4 with max = 98 to get maximum number is an array
        }
        System.out.println(max); 
        // we can use System.out.print(max) , System.err.println(max) , System.out.printf(max)
        // also to print output in console or use printWriter class also 
        // but printwriter is advance topic 
    }
}