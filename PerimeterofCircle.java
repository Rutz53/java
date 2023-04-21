/*Perimeter of Circle in Java*/

import java.util.*;
class PerimeterofCircle
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double r,p;
System.out.println("Enter Radius of the Circle:");
r =sc.nextDouble();


p =  2 * 3.14 * r;
System.out.println("Perimeter of Circle ="+p);
} 
}