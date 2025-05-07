//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int fist = firstoccurence(arr,x);
        int last = lastoccurence(arr,x);
         ArrayList<Integer> result = new ArrayList<>();
         result.add(fist);
         result.add(last);
         return result;
       
    }
static int firstoccurence(int arr[] , int x){
        int ans = -1;
        int  low  =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                ans = mid;
                high = mid -1;
            }
            else if(arr[mid] < x){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    static int lastoccurence(int arr[] , int x){
        int ans = -1;
        int low =0;
        int high =arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                ans =mid;
                low = mid+1;
            }
            else if(arr[mid] < x){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            int x = Integer.parseInt(br.readLine());
            GFG ob = new GFG();
            ArrayList<Integer> ans = ob.find(arr, x);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends