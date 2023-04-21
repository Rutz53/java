/*Area of parallelogram in Java*/

import java.util.*;
class AreaOfParallelogram
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double p,b,a;
System.out.println("Enter perpendicular height of the parallelogram:");
p =sc.nextDouble();
System.out.println("Enter base of the parallelogram:");
b =sc.nextDouble();


a =  p * b;
System.out.println("Area of parallelogram ="+a);
} 
}