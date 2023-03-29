import java.util.Scanner;
class RemoveConsonants 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String inputString = scanner.nextLine();
String result = inputString.replaceAll("[^aeiouAEIOU]", "");
System.out.println("Result: " + result);
}
}