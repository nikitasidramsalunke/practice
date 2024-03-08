 import java.io.*;
import java.util.*;

class Reverse
{
public static void main(String[]args)
{
int num1 =12345;
int rev =0;
do
{
int rem = num1%10;
rev = rev*10 + rem;
num1 = num1/10;
}
while(num1 > 0);
System.out.println(rev);
}
}