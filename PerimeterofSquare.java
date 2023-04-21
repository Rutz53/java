/*Perimeter of Square in Java*/

import java.util.*;
class PerimeterofSquare
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double l,p;
System.out.println("Enter side length of the Square:");
l=sc.nextDouble();

p= 4* l;
System.out.println("Perimeter of Square ="+p);
} 
}