import java.util.Scanner;
class Alphabetical order
{
public static void main(String[]args)
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of names: ");
nt n = sc.nextInt();
ArrayList<String> names = new ArrayList<String>();
System.out.println("Enter the names: ");
for (int i = 0; i < n; i++) {
names.add(sc.next());
}
sc.close();
Collections.sort(names);
System.out.println("Names in ascending order: " + names);
Collections.sort(names,Collections.reverseOrder());
System.out.println("Names in discending order: " + names);
}
}

