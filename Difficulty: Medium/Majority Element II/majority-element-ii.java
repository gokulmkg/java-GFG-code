//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
       int count1 = 0,count2 = 0;
       int max1 =0;
       int max2 =0;
      for(int i = 0; i < n; i++) {
    if(max1 == nums[i]) {
        count1++;
    }
    else if(max2 == nums[i]) {
        count2++;
    }
    else if(count1 == 0) {
        max1 = nums[i];
        count1 = 1;
    }
    else if(count2 == 0) {
        max2 = nums[i];
        count2 = 1;
    }
    else {
        count1--;
        count2--;
    }
}

      int c1 =0,c2 = 0;
       for(int i = 0;i<n;i++){
           if(max1 == nums[i]){
               c1++;
           }
           if(max2 == nums[i]){
               c2++;
           }
       }
       int mini =(int)(n/3)+1;
        List<Integer> result = new ArrayList<>();
           if(c1 >= mini)  result.add(max1);
           if(c2 >= mini)  result.add(max2);
  Collections.sort(result);
      return result;
    }
}