import java.util.*;
class Even
{
public static void main(String[]args)
{
int a;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of a : ");
a = in.nextInt();
if(a%2==0)
{
System.out.println("It is a even number");
}
else
{
System.out.println("It is a odd number");
}
}
}