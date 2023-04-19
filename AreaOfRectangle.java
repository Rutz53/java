/*Area of Rectangle in Java*/

import java.util.*;
class AreaOfRectangle
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double l,b,a;
System.out.println("Enter length of the Rectangle:");
l =sc.nextDouble();
System.out.println("Enter breadth of the Rectangle:");
b =sc.nextDouble();


a =  l * b;
System.out.println("Area of Rectangle ="+a);
} 
}