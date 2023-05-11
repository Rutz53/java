// Program to calculate compound interest

import java.util.*;
class CompoundInterest
{
public static void main(String args[]) 
{
Scanner sc= new Scanner(System.in);
double principal,rate,time,interest;
int number;
System.out.println("Enter the principal: ");
principal = sc.nextDouble();
System.out.println("Enter the rate: ");
rate = sc.nextDouble();
System.out.print("Enter the time: ");
time = sc.nextDouble();
System.out.print("Enter number of times interest is compounded: ");
number = sc.nextInt();
interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
System.out.println("Principal: " + principal);
System.out.println("Interest Rate: " + rate);
System.out.println("Time Duration: " + time);
System.out.println("Number of Time interest Compounded: " + number);
System.out.println("Compound Interest: " + interest);
}
}