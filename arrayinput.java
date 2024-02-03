import java.util.Scanner;
class arrayinput
{
public static void main(String[]args)
{
int x[]=new int[5];

Scanner sc=new Scanner(System.in);
x[0]=sc.nextInt();
x[1]=sc.nextInt();
x[2]=sc.nextInt();
x[3]=sc.nextInt();
x[4]=sc.nextInt();

System.out.println("The array value is : "+x[3]);
}
}