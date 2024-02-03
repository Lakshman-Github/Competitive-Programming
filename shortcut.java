class shortcut
{
public static void main(String[]args)
{
byte number1 = 10;
byte number2 = 20;
int number3 = number1+number2;
number3 += 10; //shortcut : number3 = number3 + 10;
System.out.println(number3);

}
}