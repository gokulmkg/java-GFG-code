//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void reverse(int[] arr,int pivot){
        int i=pivot+1;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
    int n=arr.length;
    int pivot=-1;
    for(int i=n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            pivot=i;
            break;
        }
    }
    if(pivot==-1){
        reverse(arr,-1);
        }
        else{
            int swap=pivot+1;
            for(int i=pivot+1;i<arr.length;i++){
                if(arr[i]<arr[swap] && arr[i]>arr[pivot])
                swap=i;
            }
            int temp=arr[pivot];
            arr[pivot]=arr[swap];
            arr[swap]=temp;
            
            reverse(arr,pivot);
        }
        
    }
}

//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends