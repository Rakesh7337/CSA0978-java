import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter names (separated by space): ");
String input = scanner.nextLine();
System.out.print("Sort order (A/D): ");
String order = scanner.nextLine().toUpperCase();
String[] names = input.split("\\s+");
if (order.equals("A")) {
Arrays.sort(names);
} else if (order.equals("D")) {
Arrays.sort(names, (a, b) -> b.compareTo(a));
} else {
System.out.println("Invalid sort order!");
return;
}
System.out.println("Sorted names:");
for (String name : names) {
System.out.println(name);
}
}
}
