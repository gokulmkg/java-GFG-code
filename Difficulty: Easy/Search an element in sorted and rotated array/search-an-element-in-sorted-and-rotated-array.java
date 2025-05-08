//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        
System.out.println("~");
}
    } 
} 
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int Search(int array[], int target) {
        // code here
        int ans = -1;
        int low  = 0,high = array.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[low] <= array[mid]){
                if(array[low] <= target && target <= array[mid]){
                    
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
                
            }
            else{
                if(array[mid] <= target && target <= array[high]){
                   
                    low = mid +1;
                }
                else{
                    high = mid -1;
                }
                
            }
        }
        return ans;
    }
}
