//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.thirdLargest(arr));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
      int first=arr[0];
      int index=0;
      for(int i=1;i<arr.length;i++){
          if(arr[i]>=first){
              first=arr[i];
              index=i;
          }
      }
      int second=-1;
      int index2=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]<=first&& arr[i]>=second &&i!=index){
              second=arr[i];
              index2=i;
          }
          
      }
      int third=-1;
      for(int i=0;i<arr.length;i++){
          if(arr[i]<=second&&arr[i]>=third&&i!=index2&&i!=index){
              third=arr[i];
          }
      }
      return third;
        
    }
}
