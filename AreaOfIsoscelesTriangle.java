/*Area of  Isosceles Triangle in Java*/

import java.util.*;
class AreaOfIsoscelesTriangle
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double a,b,area;
System.out.println("Enter base side of the Isosceles Triangle:");
b =sc.nextDouble();
System.out.println("Enter isoscalas of the Isosceles Triangle:");
a =sc.nextDouble();


area = b/2* Math.sqrt(a*a - b*b/4);
System.out.println("Area of Isosceles Triangle ="+area);
} 
}