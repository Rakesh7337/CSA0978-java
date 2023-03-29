import java.util.Scanner;
class humans
{
void eat()
{
System.out.println("eating");
}
}
class men extends humans
{
void sleep()
{
System.out.println("sleeping");
}
}
class femail extends men
{
void run()
{
System.out.println("running");
}
}
class humans
{
public static void main(String[]args)
{
femail f = new femail();
f.run();
f.sleep();
f.eat();
}
}