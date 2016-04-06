import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = sc.nextInt();
        
        String min = s.substring(0,len);
        String max = s.substring(0,len);
        
        for(int i =0; i+len<=s.length(); i++){
            
            if(s.substring(i,i+len).compareTo(min) <0) min = s.substring(i,i+len);
            if(s.substring(i,i+len).compareTo(max) >0) max = s.substring(i,i+len);
        }
        
        System.out.println(min);
        System.out.println(max);
    }
    
}
