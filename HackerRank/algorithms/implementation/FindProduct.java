//You have been given an array A of size N consisting of positive integers. You need to find and print the product of all the number in this array Modulo 10^9+7


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        long n;
        long a[] = new long[1000];
        n = sc.nextLong();
        long product =1;
        long m = 1000000007;

        for(int i =0;i<n ;i++){
            a[i] = sc.nextLong();
            product = (product*a[i])%m;
        }
        System.out.println(product);
    }
}
