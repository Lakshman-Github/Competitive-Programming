import java.util.*;
class inputandoutput
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++)
a[i]=in.nextInt();
System.out.println(Arrays.toString(a));
for(int i=0;i<5;i++)
{
if(a[i]%2==0)
System.out.println(" >> It is of even number <<");
else
System.out.println(" >> It is of odd  number <<");
}
}
}