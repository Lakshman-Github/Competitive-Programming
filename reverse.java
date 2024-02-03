class Reverse
{
public static void main(String[]args)
{
int number = 111, reverse = 0;
while (number!=0)
{
int reminder = number % 10;
reverse = reverse * 10 + reminder;
number = number/10;
}
System.out.println("The reverse of the number is : "+reverse);
reverse = 111;
if(number==reverse)
System.out.println("Yes it is a palindrome");
else
System.out.println("No it is not a palindrome");
}

}