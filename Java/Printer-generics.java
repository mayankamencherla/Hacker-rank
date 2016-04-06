class Printer
{
   //Write your code here
    public static <T> void printArray(T[] object){
        for(T obj : object){            
            System.out.println(obj);    
        }
    }
 
}


// this class has a method in a general form, and it prints objects for generic type T, which can be string or int or whatever