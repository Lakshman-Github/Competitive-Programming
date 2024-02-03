import java.util.*;
class input
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
System.out.println(s);
int a[]=new int[4];
for(int i=0;i<4;i++)
{
a[i]=in.nextInt();
}
System.out.println(Arrays.toString(a));
for(int b:a)
System.out.print(b);
}
}