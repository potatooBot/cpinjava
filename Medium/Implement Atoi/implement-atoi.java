//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
        int n=str.length();
	int val=0;
	 int i=0;
int count=0;
	for( i=0;i<n;i++){
	    if(str.charAt(i)=='-'&&i==0) {
    val=val*(-1);
    count++;
    continue;
}

if(count>=2) return -1;

	    if(Character.isDigit(str.charAt(i))==false){
	        return -1;
	    }
	    else{
	        val=val*10 +Character.getNumericValue(str.charAt(i));
	    }
	}
	if(str.charAt(0)=='-') return val*-1;
	return val;
    }
}
