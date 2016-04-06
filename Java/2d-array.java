import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        hourglass(arr);
    }
    
    public static void hourglass(int[][]arr){
        System.out.println(hourglass(arr,6));
    }
    
    public static int hourglass(int[][]arr, int size){
        
        int k=0; int l; int max = Sum(arr,size,0,0) ; int sum = 0;
        
        
        for(l=0; l<(size/2+1);l++){
            for(k=0; k<(size/2+1);k++){
                sum = Sum(arr, size, k, l);  
                if(sum>=max) max = sum;
            }
        }
        
        return max;
    }
    
    public static int Sum(int [][]arr, int size, int k, int l){
        
        int sum = 0;
        
        for(int i=k; i<k+(size/2); i++){
            for(int j=l; j<l+(size/2);j++){
                if(i==k+1 && j==l || i==k+1 && j==l+2 ) sum = sum;
                else sum = sum + arr[i][j];
            }
        }
        
        return sum;
    }
}