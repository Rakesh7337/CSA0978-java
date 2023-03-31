import java.util.Scanner;
class CharacterSearch 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = input.nextLine();
System.out.print("Enter a character: ");
char ch = input.nextLine().charAt(0);
boolean found = false;
for (int i = 0; i < str.length(); i++) 
{
if (str.charAt(i) == ch) 
{
found = true;
break;
}
}
if (found) 
{
System.out.println("'" + ch + "' is present in the string.");
} 
else {
System.out.println("'" + ch + "' is not present in the string.");
}
input.close();
}
}
