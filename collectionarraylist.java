import java.util.*;
class collectionarraylist
{
public static void main(String [] agrs)
{
List<String>arraylist=new ArrayList<String>();
Vector list=new Vector();
list.add("hello");
list.add("raju");
list.add("as");
Enumeration e =list.elements();
arraylist = Collections.list(e); 
System.out.println("Value of returned list: "+arraylist); 
}
}