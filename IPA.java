import java.util.*;
class IPA
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
int a;
System.out.println("Enter your First IPA Marks : ");
a = in.nextInt();
if(a>85)
{
System.out.println("Congratulations :) ");
}
else
{
System.out.println("Try again");
}
System.out.println("Enter your Second IPA Marks : ");
a = in.nextInt();
if(a>85)
{
System.out.println("Great");
}
else
{
System.out.println("Try again");
}
System.out.println("Enter your Third IPA Marks : ");
a = in.nextInt();
if(a>85)
{
System.out.println("Congratulations :) ");
}
else
{
System.out.println("Try again");
}
System.out.println(a+a+a);
}
}
