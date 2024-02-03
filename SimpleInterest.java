import java.util.*;
class SimpleInterest
{
public static void main(String[]args)
{
int p,n,r,SI,total;
Scanner in=new Scanner(System.in);
System.out.println("\nEnter the values of p :\t ");
p=in.nextInt();
System.out.println("\nEnter the values of n :\t ");
n=in.nextInt();
System.out.println("\nEnter the values of r :\t ");
r=in.nextInt();
SI = (p*n*r)/100;
System.out.println("The values of Simple Interest : "+SI);
total = p + SI;
System.out.println("The total value : "+total);

}
}