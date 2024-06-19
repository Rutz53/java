//You are given an array A consisting of N integers. 
//task is Print the sum of the elements in the array.

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n;
         n = sc.nextInt();
        long sum =0;
        long a[] = new long[n];

       

        for(int i = 0;i< n;i++){
            a[i] = sc.nextLong();
            sum = sum + a[i];
        }
        System.out.println(sum);

    }
}
