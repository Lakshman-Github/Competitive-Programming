import java.util.*;
class replace
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
String a[]=new String[6];
for(int i=0;i<a.length;i++)
a[i]=in.nextLine();
a[1]="l";
System.out.println(Arrays.toString(a));
}
}