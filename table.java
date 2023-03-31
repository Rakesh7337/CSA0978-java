import java.util.Scanner;
class Table
{  
void printTable(int n)
{ 
for(int i=1;i<=n;i++){  
System.out.println(n*i);  
try
{  
Thread.sleep(400);  
}
catch(Exception e)
{
System.out.println(e);
}  
}  
}  
}  
class A extends Thread{  
Table t;  
A(Table t)
{  
this.t=t;  
}  
public void run()
{  
t.printTable(5); 
}  
}  
class B extends Thread
{  
Table t;  
B(Table t)
{  
this.t=t;  
}  
public void run()
{  
t.printTable(4);  
}  
}  
class threadtable
{  
public static void main(String args[])
{  
Table obj = new Table();  
A t1=new A(obj);  
B t2=new B(obj);  
t1.start();  
t2.start();  
}  
}