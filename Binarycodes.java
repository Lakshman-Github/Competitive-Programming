import java.util.*;
class Binarycodes
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
int input1 = in.nextInt();
int input2 = in.nextInt();
int input3 = in.nextInt();
int input4 = in.nextInt();

if(input1==1)
System.out.println(input1+7);
else
System.out.println(0);
if(input2==1)
System.out.println(input1+3);
else
System.out.println(0);
if(input3==1)
System.out.println(input1+1);
else
System.out.println(0);
if(input4==1)
System.out.println(input1+0);
else
System.out.println(0);

System.out.println("The combined vlaue of these code are : "+(input1*8 + input2*4 + input3*2 + input4*1));
}
}