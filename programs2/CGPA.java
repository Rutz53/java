import java.util.*;
class CGPA
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double s1,s2,s3,s4,s5,s6,cgpa,p;
System.out.println("Enter grade points in subject1:");
s1=sc.nextDouble();
System.out.println("Enter grade points in subject2:");
s2=sc.nextDouble();
System.out.println("Enter grade points in subject3:");
s3=sc.nextDouble();
System.out.println("Enter grade points in subject4:");
s4=sc.nextDouble();
System.out.println("Enter grade points in subject5:");
s5=sc.nextDouble();
System.out.println("Enter grade points in subject6:");
s6=sc.nextDouble();

cgpa=(s1+s2+s3+s4+s5+s6)/6.0;
p=9.5*cgpa;

System.out.println("CGPA is: "+cgpa);
System.out.println("CGPA PERCENTAGE is: "+p);
}
}