class CountOddEvenNo
{
public static void main(String[]args)
{
int a=2799;
int odd=0;
int even=0;
do
{
int r=a%10;
if(r%2==0)
{
even++;
}

a=a/10;
odd++;
}
while(a>0);
System.out.println("odd no ="+odd+"&even no ="+even);
}

}