class StringToInteger
{
    public static void main(String[] args) {
        String s = "   -42";
        int result = myAtoi(s);
        System.out.println(result); // Output: -42
    }
    public static int myAtoi(String s) {
       String str = s.trim();
        int i = 0, sign = 1;
        long num = 0;

    if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
        sign = (str.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    while (i < str.length() && Character.isDigit(str.charAt(i))) {
        int digit = str.charAt(i) - '0';

        if (num > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        num = num * 10 + digit;
        i++;
    }

    return (int) (num * sign);

    }
}