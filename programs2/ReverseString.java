//program to reverse a string
 
import java.io.*;
import java.util.*;
class ReverseString
 {
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a string:");
String Str = scanner.nextLine();
char[] arr = Str.toCharArray();
String rev = "";
   
for(int i = Str.length() - 1; i >= 0; i--)
{
rev = rev + Str.charAt(i);
} 
System.out.println(rev);
}
}