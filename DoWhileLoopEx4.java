import java.io.*;
import java.util.*;
class DoWhileLoopEx4
{
public static void main(String[]args)
   {
    int v=1;
    do
    {
   int a=0;a=v*3;
   if(a%2==0)
     {
      System.out.println(a); 
}
      v++;
    }
     while(v<=10);
   }



}