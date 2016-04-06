import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            Set<Integer> set = new HashSet<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int rm = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.addLast(num);
                set.add(num);
                
                if(deque.size() == m){
                    rm = (int)deque.removeFirst();
                    max = Math.max(max,set.size());
                    if(!deque.contains(rm)) set.remove(rm);
                }
            }
            
            System.out.println(max);
            
        }
    }
