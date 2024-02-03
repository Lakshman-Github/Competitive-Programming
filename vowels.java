class vowels
{
public static void main(String[]args)
{
String data="Games";
char[] vowels={'a','e','i','o','u'};
int count = 0;
for(int i=0;i<data.length();i++)
{
System.out.print(data.charAt(i));
for(char vowel:vowels)
{
if(data.charAt(i)==vowel){
count++;
}
}
}
System.out.println("\nNo of Vowels in the string :"+count);
}
}