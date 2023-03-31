import java.util.*;

public class CollectionArrayListExample {
public static void main(String[] args) {
List<String> arraylist = new ArrayList<String>();
Vector<String> vector = new Vector<String>();
vector.add("hello");
vector.add("raju");
vector.add("as");
Enumeration<String> e = vector.elements();
arraylist = Collections.list(e); 
System.out.println("Value of returned list: " + arraylist); 
}
}