class Palindrome
{
public static void main(String[] args) {
    int num = 121;
    if(isPalindrome(num))
    {
        System.out.println(num + " is a palindrome.");
    }
    else
    {
        System.out.println(num + " is not a palindrome.");
    }
}

public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = 0;
        int num = x;
        while(num>0)
        {
            temp = temp * 10 + (num%10);
            num = num/10;
        }
        return x == temp;


    }

}