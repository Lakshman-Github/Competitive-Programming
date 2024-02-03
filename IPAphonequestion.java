import java.util.*;
class IPAphonequestion
{
public static void main(String[]args)
{

Scanner in=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<5;i++)
arr[i]=in.nextInt();
System.out.print(Arrays.toString(arr));
int brr[]=new int[5];
for(int i=0;i<5;i++)
brr[i]=in.nextInt();
System.out.println(Arrays.toString(brr));

if(Arrays.equals(arr,brr))
System.out.println("Both are equal");
else
System.out.println("Not equal");
}
}
