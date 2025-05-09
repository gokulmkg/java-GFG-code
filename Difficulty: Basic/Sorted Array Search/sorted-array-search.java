//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.searchInSorted(arr, k));
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean searchInSorted(int arr[], int k) {
       
        int low =0,high = arr.length-1;
        while(low<=high){
             int mid = low + (high-low) / 2;
            if(k == arr[mid]){
                return true;
            }
            else if(k > arr[mid]){
                low=mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return false;
    }
}