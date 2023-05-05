/*Area of Equilateral Triangle in Java*/

import java.util.*;
class AreaOfEquilateralTriangle
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double l,a;
System.out.println("Enter side length of the Equilateral Triangle:");
l =sc.nextDouble();

a =  Math.sqrt(3)/4*l * l;
System.out.println("Area of Equilateral Triangle ="+a);
} 
}