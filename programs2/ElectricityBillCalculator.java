import java.util.*; 
public class ElectricityBillCalculator
{

 public static void main (String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of units consumed:");
int unitsConsumed = sc.nextInt();

double billAmount;

if(unitsConsumed <= 50)
{
billAmount = unitsConsumed * 0.50;
}
else if(unitsConsumed <= 150)
{
billAmount = 25 + (unitsConsumed-50)* 0.75;
}
else if(unitsConsumed <= 250)
{
billAmount = 100 + (unitsConsumed-100)*1.20;
}
else{
billAmount = 220 + (unitsConsumed - 250) * 1.50;
}

System.out.println("Your electricity bill for " + unitsConsumed + " units is: " + billAmount);
    }
}
