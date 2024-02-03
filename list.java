import java.util.*;
class List
{
public static void main(String[]args)
{
ArrayList<String> stu = new ArrayList<String>();

stu.add("Kumar");
stu.add("Gopi");
stu.add("Kozhli");

Iterator<String> itr = stu.iterator();

while(itr.hasNext())
{
System.out.println("Mr."+itr.next());
}
}
}