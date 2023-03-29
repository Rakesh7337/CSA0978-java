class human
{
void eat()
{
System.out.println("eating");
}
}
class men extends human
{
void sleep()
{
System.out.println("sleeping");
}
}
class main
{
public static void main(String[]args)
{
men m = new men();
m.sleep();
m.eat();
}
}