import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,i,fact=1;
        n = sc.nextInt();

        for(i=1;i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
}
}
