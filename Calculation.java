import java.util.*;
class Calculation{
void sum(int a,int b)
{
System.out.println(a+b);
}
void sum(double a,double b)
{
System.out.println(a+b);
}
public static void main(String[]args)
{
Calculation cobj=new Calculation();
cobj.sum(10.5,10.5);
cobj.sum(20,20);
}
}