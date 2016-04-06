import static java.lang.System.in;
    
class Prime{
    void checkPrime(Integer... num){
        for(int i=0; i<num.length; i++){
            if(isPrime(num[i])){
                 System.out.print(num[i]+" ");
            }
        }
        
        System.out.println();
    }
    
    boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; 2*i<=num; i++){
            if(num%i==0) return false;
        }
        
        return true;
    }
}