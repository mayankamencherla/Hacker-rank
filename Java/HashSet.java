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
        sc.nextLine();
        
        Set<String> set = new HashSet<String>();
        
        while(sc.hasNextLine()){
            set.add(sc.nextLine());
            System.out.println(set.size());
        }
    }
}