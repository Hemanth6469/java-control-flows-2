import java.util.Scanner;
class table
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter which table you want");
int tab = sc.nextInt();
for (int i = 1; i <= 10; i++) 
System.out.println(tab + " x " + i + " = " + (tab * i));
}
}