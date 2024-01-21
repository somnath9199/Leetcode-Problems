public class Palindrome{
    public static Boolean isPalindrome(int x )
    {
       if(x<0)
       {
        return false ;
       } 
       int temp = x;
       long reversed = 0;
       while(temp!=0)
       {
        int digit =(int) temp % 10;
        reversed = reversed * 10 + digit;
        temp/=10;
       }
       return (x == reversed);
    }
    public static void main(String args[])
    {
      isPalindrome(-121);
    }
}

//question number 9