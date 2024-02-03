import java.util.*;
class findUppercaseLetters
{
public static void main(String[]args)
{
int count = 0;
Scanner in=new Scanner(System.in);
String str = in.nextLine();
for(int i=0;i<str.length();i++)
{
if(Character.isUpperCase(str.charAt(i)))
count++;
}
System.out.println("Output :"+count);
}
}

//Keyword : Character.isUpperCase