import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the principal amount: ");
double principal = input.nextDouble();
System.out.print("Enter the no of years: ");
double years = input.nextDouble();
System.out.print("Is customer senior citizen (y/n): ");
String senior = input.next();
double rate = 0.10;
if (senior.equalsIgnoreCase("y")) {
rate = 0.12;
}
double interest = calculateInterest(principal, rate, years);
System.out.println("Interest: " + interest);
input.close();
}
public static double calculateInterest(double principal, double rate, double years) {
double interest = principal * rate * years;
return interest;
}
}