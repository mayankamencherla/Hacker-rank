 import java.io.*;
    import java.util.*;



    public class Solution {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
            
          String sc = scan.nextLine();
          
        //!,?._'@ being delimiters
          StringTokenizer st = new StringTokenizer(sc,"!,?._'@ ");        // from scan, removes tokens and stores in st
            
          System.out.println(st.countTokens());
         
          while(st.hasMoreTokens()){
              System.out.println(st.nextToken());
          }

        }
    }
