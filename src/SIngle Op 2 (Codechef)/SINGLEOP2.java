/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for (int i=0;i<t ;i++ ){
	  int n=sc.nextInt();
	int count=1;
	  String str=sc.next();
	  
for (int j=1;j<n ;j++ ){
  if(str.charAt(j)=='0') count++;
  else break;
} 

System.out.println(count);
	
	}
}
}