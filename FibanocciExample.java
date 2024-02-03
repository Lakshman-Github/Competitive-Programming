class FibanocciExample
{
public static void main(String[]args)
{
int n1=0,n2=1,n3,i,count=10;
System.out.println(n1+" "+n2+" ");
for(i=2;i<count;++i)
{
n3=n1+n2;
System.out.print(" "+n3+" ");
n1=n2;
n2=n3;
}
}
}

/* 

0utput: 

0   1   1   2   3   5   8   13   21
n1  n2  n3

    n1  n2  n3
 
        n1  n2  n3


n1,n2,n3 --> shifts from one place to another.

four lines of coding to understand fibanocci series

step 1 : n3 = n1 + n2;
step 2 : print (n3)
step 3 : n1 = n2;
step 4 : n2 = n3;


*/





