import java.util.Scanner;
class floatcom
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a float number");
float float1 = sc.nextFloat();
System.out.println("Enter another float number");
float float2 = sc.nextFloat();
int num1 = (int)(float1*1000);
int num2 = (int)(float2*1000);
if(num1==num2)
{
System.out.println("Entered numbers are same");
}
else{
System.out.println("Entered numbers are not same");}
}
}


