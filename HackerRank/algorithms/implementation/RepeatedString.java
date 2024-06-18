import java.util.*;
public class RepeatedString{

static long repeatedString(String s, long n){
int strlength = s.length();
long q = 0, r = 0;

q = n / strlength;
r = n % strlength;

long partialStrLen = (r == 0) ? 0 :r ;
long acount = q * getLetterCount(s , s.length()) + getLetterCount(s, partialStrLen);
return acount;
}


public static long getLetterCount(String s, long strLength){
long count = 0;
for(int i = 0; i <strLength; i++){
if(s.charAt(i) == 'a')
count++;
}
return count;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.next();
long n = sc.nextLong();
long aCount= repeatedString(s, n);

System.out.println(aCount);
sc.close();
}

}

