//Future investment value program in java

import java.lang.*;
import java.util.*;
class FutureInvestValue
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter present value: ");
double p,r,y,f;
p=sc.nextDouble();
System.out.println("Enter the interest rate: ");
r=sc.nextDouble();
System.out.println("Enter the time period in years: ");
y=sc.nextDouble();
f=p*Math.pow((1+r/100),y);
System.out.println("future investment value is: "+f);
}
}