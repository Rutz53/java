import java.util.*;
class VolumeOfSphere
{
public static void main(String args[])
{
double r,v;
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius:");
r=sc.nextDouble();

v=4*3.14*r*r*r/3;
System.out.println("Volume of Sphere="+v);
}
}