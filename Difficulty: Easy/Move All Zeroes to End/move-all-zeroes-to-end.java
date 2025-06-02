// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int index = 0;
        int temp[] = new int[arr.length];
     for(int i =0;i<arr.length;i++) {
         if(arr[i] != 0){
             temp[index] = arr[i];
             index++;
         }
     }
     for(int i =0;i<index;i++){
         arr[i] = temp[i];
     }
     for(int i = index;i<arr.length;i++){
         arr[i] = 0;
     }
    }
}