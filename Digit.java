class Digit
{
public static void main(String[]args)
{

int a=1234;
int rem=0;
do
{
rem=a%10;
a=a/10;
System.out.println(rem);
}while(a>0);
}




}