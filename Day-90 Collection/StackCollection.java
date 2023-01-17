import java.util.*;  
public class StackCollection
{  
public static void main(String args[])
{  
Stack<String> stack = new Stack<String>();  
stack.push("Aadarsh");  
stack.push("Kishore");  
stack.push("Pawan");  
stack.push("Vignesh");  
stack.push("Balaji"); 
stack.push("Hari");   
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  
