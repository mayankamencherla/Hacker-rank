import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       A=A.toLowerCase();
       B=B.toLowerCase();
       
       char c1[] = null;
       char c2[] = null;
       
       if(A.length() == B.length()){
           
       c1 = A.toCharArray();
       c2 = B.toCharArray();
           
       Arrays.sort(c1);
       Arrays.sort(c2);
           
       if(Arrays.equals(c1,c2)){
           return true;
       }
           
       else return false;
           
       }
   
        
       else return false;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
