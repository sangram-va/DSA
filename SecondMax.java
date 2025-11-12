class SecondMax
{
    // remember to always keep class and file name it is convention(not rule as if we dont rule we get error) but still it's good practice
    public static void main(String[] args) {
        //you can always use scanner class to take inputs
        int [] arr = {12,34,-9,25,78,65,7,9};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE; // we can take any value it doesn't matter
        for(int i=0;i<arr.length;i++)
        {
            if(max < arr[i])
            {
                secMax = max ; // store the max value in secMax then replace Max with arr[i]
                max = arr[i];
            }
            else if(secMax<arr[i] && max!=arr[i]) // max!=arr[i] this is to avoid dupllicates if 98,98 are greater so
            {
                secMax = arr[i];
            }
        }
        System.out.print("Maximum is "+max+" and Second Maximum is "+secMax);
        // output : Maximum is 78 and Second Maximum is 65

    }

}