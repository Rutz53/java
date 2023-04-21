/*Perimeter of Rectangle in Java*/

import java.util.*;
class PerimeterofRectangle
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double l,b,p;
System.out.println("Enter length of the Rectangle:");
l =sc.nextDouble();
System.out.println("Enter breadth of the Rectangle:");
b =sc.nextDouble();

p= 2*(l+b);
System.out.println("Perimeter of Rectangle ="+p);
} 
}