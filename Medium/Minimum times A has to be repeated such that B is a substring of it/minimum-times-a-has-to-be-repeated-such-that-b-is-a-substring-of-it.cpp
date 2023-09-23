//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int minRepeats(string A, string B) {
      if(A==B) return 1;
        if(A.length()>B.length()) return -1;
        string dup=A;
        int count=1;
        while(A.length()<B.length()){
            A+=dup;
            count++;
        }
        if(A.find(B)!=-1) return count;
        A+=dup;
        count++;
        if(A.find(B)!=-1) return count;
        return -1;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d ",&t);
    while (t--) {
        string A,B;
        getline(cin,A);
        getline(cin,B);

        Solution ob;
        cout << ob.minRepeats(A,B) << endl;
    }
    return 0;
}
// } Driver Code Ends