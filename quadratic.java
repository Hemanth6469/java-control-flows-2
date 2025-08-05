import java.util.Scanner;
class quadratic 
{
public static void main(String args[]) 
{
double discriminant, root1, root2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter coefficients a, b and c:");
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
discriminant = b * b - 4 * a * c;
if (discriminant > 0) {
    root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
    root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
    System.out.println("Roots are real and distinct.");
    System.out.println("Root 1 = " + root1);
    System.out.println("Root 2 = " + root2);
    } 
else if (discriminant == 0) {
    root1 = -b / (2 * a);
    System.out.println("Roots are real and equal.");
    System.out.println("Root = " + root1);
    } 
else {
    double real = -b / (2 * a);
    double imaginary = Math.sqrt(-discriminant) / (2 * a);
    System.out.println("Roots are complex and imaginary.");
    System.out.println("Root 1 = " + real + " + " + imaginary + "i");
    System.out.println("Root 2 = " + real + " - " + imaginary + "i");
}
}
}