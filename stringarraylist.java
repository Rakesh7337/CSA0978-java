import java.util.*;
class stringarraylist
{
public static void main(String[]args)
{
ArrayList<String> list=new ArrayList<String>();
list.add("hai");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}