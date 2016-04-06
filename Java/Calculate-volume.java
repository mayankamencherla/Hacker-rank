class Calculate{
    Scanner sc = new Scanner(System.in);
    Output output = new Output();
    
    public int getINTVal() throws NumberFormatException,IOException{
        int val = sc.nextInt();        
        if(val<=0) throw new NumberFormatException("All the values must be positive");
        return val;
    }
    
    public double getDoubleVal() throws NumberFormatException,IOException{
        double val = sc.nextDouble();        
        if(val<=0) throw new NumberFormatException("All the values must be positive");
        return val;
    }
    
    static Volume get_Vol(){
        return new Volume();
    }
}

class Output{
    void display(double volume){
        System.out.printf("%.3f\n",volume);
    }
}

class Volume{
    double main(int a){
        return a*a*a;
    }
    
    double main(int l, int b, int h){
        return l*b*h;
    }
    
    double main(double r){
        return Math.PI*r*r*r*2/3;
    }
    
    double main(double r, double h){
        return Math.PI*r*r*h;
    }
}
