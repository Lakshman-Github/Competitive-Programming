class Condition
{
public static void main(String[]args)
{
int ageOfPerson = 17;
int a = 10;

String name = ageOfPerson >= 18 ? "eligible" : "not eligible";
String Ternary = a>=10 ? "Yes it is greater" : "No it is not greater";

System.out.println(name);
System.out.println(Ternary == "It is not Greater");
}
}