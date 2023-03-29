import java.util.Scanner;
class overloading
{
void sum(int a,int b)
{
System.out.printin("a+b");
}
void sum(int a,long b,int c);
{
System.out.printin("a+b+c");
}
public static void main(String[]args);
{
overloading o = new overloading();
o.sum(1,2);
o.sum(1,2,3);
}
}
