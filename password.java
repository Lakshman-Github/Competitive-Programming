import java.util.*;
class password
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
String password = in.nextLine();
if(password.equals("Hellow"))
System.out.println("Password matches correctly");
else
System.out.println("Password dosn't matches");
}
}