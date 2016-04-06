import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
          
         boolean output = paranthesisCheck(input);
         System.out.println(output); 
      }
      
   }
    
    public static boolean paranthesisCheck(String input){
        
        Stack<Character> stack = new Stack<Character>();
        char c;
        
        for(int i=0; i<input.length(); i++){
            c = input.charAt(i);
            
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }
            
            else if(c == '}'){
                if(stack.isEmpty()) return false;
                
                if(stack.pop() != '{') return false;
            }
            
            else if(c == ']'){
                if(stack.isEmpty()) return false;
                
                if(stack.pop() != '[') return false;
            }
            
            else if(c == ')'){
                if(stack.isEmpty()) return false;
                
                if(stack.pop() != '(') return false;
            }
            
            
        }
        
        if(stack.isEmpty()) return true;
        else return false;
    }
}
