import java.util.*;
class correctusername_password
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
String username;
String password;
do{
System.out.println("Please enter the username : ");
username = in.nextLine();
System.out.println("Please enter the password : ");
password = in.nextLine();
}while(username.equalsIgnoreCase("Rajesh") 
|| password.equalsIgnoreCase("hellow"));

}
}