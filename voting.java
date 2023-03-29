import java.util.Scanner;
class voting
{
public static void main(String[] args)
{
int age;
Scanner c = new Scanner(System.in);
System.out.print("Enter your age=");
age = c.nextInt();
if (age >= 18)
System.out.println("You are eligible for vote.");
else
{
System.out.println("You are not eligible for vote.");
}
}
}