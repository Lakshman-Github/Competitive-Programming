import java.util.*;
class list
{
public static void main(String[]args)
{

ArrayList list=new ArrayList();

list.add(10);
list.add("Java");
list.add(true);
list.add(null);
list.add('c');
list.add(56.78);

for(var l: list)
{
System.out.println("Non generic :"+l);
}
}
}