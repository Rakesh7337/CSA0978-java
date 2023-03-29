import java.util.Scanner;
class arithmetic
{
public static void main (String [] args)
{
int a,b,Add,Sub,Mul,Div;
Scanner r = new Scanner(System.in);
    a= r.nextInt();
    b= r.nextInt();
Add=a+b;
Sub=a-b;
Mul=a*b;
Div=a%b;
System.out.println("Sum = " + Add);
System.out.println("Difference = " + Sub);
System.out.println("Multiplication = " + Mul);
System.out.println("Division = " + Div);
}
}