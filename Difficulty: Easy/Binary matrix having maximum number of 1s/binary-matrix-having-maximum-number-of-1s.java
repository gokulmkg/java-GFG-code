//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class GfG {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0) {
            int B = sc.nextInt();
            int arr[][] = new int[B][B];
            for(int i = 0; i < B; i++) {
                for(int j = 0; j < B; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int ans[] = obj.findMaxRow(arr, B);
            for(int i = 0; i < 2; i++) {
                out.print(ans[i] + " ");
            }
            out.println();
        
out.println("~");
}
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        // code here
        int x =1;
    int count_max = 0;
    int index = 0;
    for(int i =0;i<N;i++){
        int count_one = N - lowerbound(mat[i],N,x);
        if(count_one > count_max){
            count_max = count_one;
            index = i;
        }
    }
 return new int[]{index,count_max};
        
    }
    static int lowerbound(int arr[],int n,int x){
    int low = 0,high = n-1;
     int ans = n;
     
     while(low <= high){
         int mid = (low + high) /2;
         if(arr[mid] >= x){
             ans = mid;
             high = mid - 1;
         }
         else {
             low = mid +1;
         }
     }
     return ans;
      
    }
    
    
};