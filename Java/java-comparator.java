// Write your Checker class here

class Checker implements Comparator<Player>{
    
    
        @Override
        public int compare(Player player1, Player player2){
            if(Integer.compare(player1.score,player2.score)!=0){
                return -Integer.compare(player1.score,player2.score);    
            }
            
            else return -player1.name.compareTo(player2.name);
        }       
        
}