import java.util.*;
class arrayaddition
{
public static void main(String[]args)
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of elements to store : ");
n=in.nextInt();
int a[]=new int[7];
for(int i=0;i<n;i++)

{

if(a[i]%2==0)
{
System.out.println("it is of even number : "+a[i]);

}
}


}
}