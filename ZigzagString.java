class ZigzagString
{
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s,numRows));
    }
    public static String convert(String str, int noOfRows) {
       StringBuilder [] sb = new StringBuilder[noOfRows];
	    
	    for(int i=0;i<sb.length;i++)
	    {
	        sb[i] = new StringBuilder();
	    }
	    
	    //convert the string to Character Array 
	    char[] ch = str.toCharArray();
	    int index = 0; // to track the Character array 
	    while(index < ch.length)
	    {
	        for(int j=0;j<noOfRows && index < ch.length;j++) //index < ch.length this condition says the string is completed or not if completed it wll not take further this iteration 
	        {
	            sb[j].append(ch[index++]);
	        }
	         for(int j=noOfRows - 2;j > 0 && index < ch.length;j--) // why noOfRows-2 because we will traverse till noOfrows = 3 (i.e till 2 index)in 2d array we should traverse back to index 1 
	        {
	            sb[j].append(ch[index++]);
	        }
	    }
	    StringBuilder res = new StringBuilder("");
	    
	    for(int i=0;i<noOfRows;i++)
	    {
	        res.append(sb[i]);
	    }
	    return res.toString();
 
    }
}