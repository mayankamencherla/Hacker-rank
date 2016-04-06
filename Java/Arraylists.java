import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tcases = sc.nextInt();
        
        List<int[]> list = new ArrayList<int[]>();
        
        //code to create list from given input
        for(int i=0; i<tcases; i++){
            int d = sc.nextInt();
            int[] temparray = new int[d];
            for(int j=0; j<d; j++){
                temparray[j] = sc.nextInt();
            }
            
            list.addAll(Arrays.asList(temparray));
                
        }
        
        
        //calls function to pick data from list given input
        int numtries = sc.nextInt();
        for(int k=0; k<numtries; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();   //we need arraylist position y from xth line. Basically list.get(x)[y];
            
            Get(list,x,y);
        }
        
    }
    
    public static void Get(List<int[]> list,int x, int y){
        //System.out.println(list.get(x-1)[y-1]);
        
        try{
            System.out.println(list.get(x-1)[y-1]);
        }
        
        catch(IndexOutOfBoundsException err){
            System.out.println("ERROR!");
        }
    }
}