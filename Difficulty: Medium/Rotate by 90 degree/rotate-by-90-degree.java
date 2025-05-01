//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();

            GFG g = new GFG();
            g.rotate(arr);
            printMatrix(arr);

            System.out.println("~");
        }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        int n = mat.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == j){
                    break;
                } else{
                    int temp = mat[j][i];
                    mat[j][i] = mat[i][j];
                    mat[i][j] = temp;
                    }}
            }
        for(int i =0;i<n;i++){
            int left = 0;
            int right = n-1;
            while(left < right){
               int temp = mat[i][left];
               mat[i][left] =mat[i][right];
               mat[i][right] = temp;
               left++;
               right--;
            }
        }
    }
}