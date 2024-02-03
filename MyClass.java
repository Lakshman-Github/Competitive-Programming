import java.util.*;
class Myclass
{
public static void main(String[]args)
{
int count=0; 
int s = 0;
int a[]={1,2,3,4,5};
for(int i=0;i<5;i++)
{
if(a[i]>1 && a[i]<4)
{
s = s+a[i];
count++;
}
}
int d = s/count;
System.out.println("Output "+d);
}

}