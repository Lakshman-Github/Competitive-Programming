class encryption_and_decryption
{
public static void main(String[]args)
{
String text = "Hey, how's it hangin?";
System.out.println(text);

char[] chars = text.toCharArray();

for(char c: chars){
c+=1;
System.out.print(c);
}
}
}