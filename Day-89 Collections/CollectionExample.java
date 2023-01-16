import java.util.*;  
public class CollectionExample
 {  
public static void main(String args[])
{  
LinkedList<String> al=new LinkedList<String>();  
al.add("Balaji");  
al.add("Aadarsh");  
al.add("Kishore");  
al.add("Pawan");  
al.add("Vignesh");  
al.add("Hari");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
