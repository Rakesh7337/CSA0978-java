import java.util.Scanner;
class rightrianglepattern 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.printin("enter number of rows: ");
int n = scanner.nextInt();
for (int i = 1; i <= n; i++) 
{
for (int j = 1; j <= n-i; j++) 
{
System.out.printin("  ");
}
for (int j = 1; j <= i; j++)
{
System.out.println("*");
}
System.out.println();
}
}
}

