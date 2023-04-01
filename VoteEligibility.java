import java.util.Scanner;

public class VoteEligibility {
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = 0;
if (sc.hasNextInt())
{
age = sc.nextInt();
if (age >= 18) {
System.out.println("You are eligible to vote.");
} else {
int yearsLeft = 18 - age;
System.out.println("you are not eligible to vote.");
System.out.println("You can vote after " + yearsLeft + " years.");
}
}else{
System.out.println("invalid input");
}
sc.close();
}
}
