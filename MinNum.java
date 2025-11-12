class MinNum
{
    public static void main(String[] args)
    {
        int [] arr = {4,6,98,3,56,100};
        int min = Integer.MAX_VALUE; // you can take min = arr[0] as well but Integer.MAX_VALUE is the optimised approach
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i]) min = arr[i];
            // example if arr[i] has 4 which is smaller than 98 so we are replacing 
            // min = 98 with min = 4 to get minimum number is an array
        }
        System.out.println(min); 
        // we can use System.out.print(min) , System.err.println(min) , System.out.printf(min)
        // also to print output in console or use printWriter class also 
        // but printwriter is advance topic 
    }
}