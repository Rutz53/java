/*Perimeter of Equilateral Triangle in Java*/

import java.util.*;
class PerimeterofEquilateralTriangle
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double a,p;
System.out.println("Enter side length of the Equilateral Triangle:");
a =sc.nextDouble();

p= 3*a;
System.out.println("Perimeter of Equilateral Triangle ="+p);
} 
}