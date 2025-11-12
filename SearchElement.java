class SearchElement
{
    // Short and optimised way also considered as linear search 
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,9,3,10};
        int search = 6; // you can also use Scanner class to take inputs 
        // for each loop (also called as enhanced for loop)
        // or you can use general for loop as well
        for(int ele : arr) 
        {
            if( ele == search) 
            {
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }
}