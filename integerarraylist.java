import java.util.*;
class integerarraylist
{
public static void main(String[]args)
{
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(10);
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}