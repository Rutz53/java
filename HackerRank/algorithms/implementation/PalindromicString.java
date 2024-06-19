//You have been given a String S. You need to find and print whether this string is a palindrome or not. 
//If yes, print "YES" (without quotes), else print "NO" (without quotes).


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s ,reverse ="";
        s =sc.next();
        int sLength = s.length();

        for(int i = sLength -1; i>=0; --i){
            reverse = reverse + s.charAt(i);
        }

        if(s.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
}
}
