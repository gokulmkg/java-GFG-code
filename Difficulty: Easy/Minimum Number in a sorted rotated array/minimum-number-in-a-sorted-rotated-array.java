//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            System.out.println(new Solution().minNumber(arr,0,n-1));
        
System.out.println("~");
}
    }
    
}
// } Driver Code Ends


class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        // Your code here
       int ans = Integer.MAX_VALUE;
       low = 0;
       high = arr.length-1;
       while(low <= high) {
           int mid = (low + high) /2;
        if(arr[low] <= arr[mid]){
            ans =Math.min(ans,arr[low]);
            low = mid+1;
        }   
        else {
            ans = Math.min(ans,arr[mid]);
            high =mid -1;
             }
           
       }
      return ans;
        
    }
}