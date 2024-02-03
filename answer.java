class answer
{
public static void main(String[]args)
{
int age=18;
int Java_level=6,python_level=5,C_level=5;
int English = 85,physics = 82;
int Mathematics = 92;
if(age>=18)
{
System.out.println("You can vote");
}
if(English >= 80 && physics >= 80 && Mathematics >= 90)
{
System.out.println("You are eligible for scholarship");
}
else
{
System.out.println("You are not eligible");
}
if(Java_level>3 && python_level > 3 && C_level>3)
{
System.out.println("You can apply for programmer job");
}
else
{
System.out.println("You cannot apply for programmer job");
}
}}