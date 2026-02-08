
import java.util.Set;
import java.util.HashSet;
class MaxLengthOfSubString 
{
    public static void main(String[] args) {
        String s = "pwwekewxpw";
        System.out.println(maxLengthOfSubString(s));
    }
    public static int maxLengthOfSubString(String str)
    {
        Set<Character> charSet = new HashSet<Character>();
        int maxLen = 0;
        int left = 0;
        for(int right = 0; right < str.length() ; right++)
        {
            while(charSet.contains(str.charAt(right)))
            {
                charSet.remove(str.charAt(left));
                left++;
            }
            charSet.add(str.charAt(right));
            maxLen =Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}