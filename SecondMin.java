class SecondMin
{
    // remember to always keep class and file name it is convention(not rule as if we dont rule we get error) but still it's good practice
    public static void main(String[] args) {
        //you can always use scanner class to take inputs
        int [] arr = {12,34,-9,25,78,65,7,9};
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE; // we can take any value it doesn't matter
        for(int i=0;i<arr.length;i++)
        {
            if(min > arr[i])
            {
                secMin = min ; // store the min value in secMin then replace Max with arr[i]
                min = arr[i];
            }
            else if(secMin > arr[i] && min!=arr[i]) // min!=arr[i] this is to avoid duplicates if 98,98 are greater so
            {
                secMin = arr[i];
            }
        }
        System.out.print("Minimum is "+min+" and Second Minimum is "+secMin);
        // output :Minimum is -9 and Second Minimum is 7

    }

}