/*Area of Triangle in Java*/

import java.util.*;
class AreaOfTriangle
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double h,b,a;
System.out.println("Enter height of the Triangle:");
h =sc.nextDouble();
System.out.println("Enter breadth of the Triangle:");
b =sc.nextDouble();


a = 0.5 * h * b;
System.out.println("Area of Triangle ="+a);
} 
}