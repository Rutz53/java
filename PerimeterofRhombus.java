/*Perimeter of Rhombus in Java*/

import java.util.*;
class PerimeterofRhombus
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double d1,d2,p;
System.out.println("Enter length of first diagonal the Rhombus:");
d1 =sc.nextDouble();
System.out.println("Enter length of second diagonal the Rhombus:");
d2 =sc.nextDouble();

p = 2* Math.sqrt(d1*d1 + d2*d2);
System.out.println("Perimeter of Rhombus ="+p);
} 
}