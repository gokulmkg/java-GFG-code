//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
   int ans = -1;
   int low =0;
   int high = arr.length-1;
   while(low<=high){
       int mid = (low+high)/2;
       if(arr[0] == 1){
           return 0;
           
       }
           if(arr[mid] == 1 && arr[mid]  > arr[mid-1]){
               return mid;
           }
            else if(arr[mid] < 1){
               low = mid +1;
            }
            else{
                high = mid -1;
            }
         
       }
       return ans;
   
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.firstIndex(arr));
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends