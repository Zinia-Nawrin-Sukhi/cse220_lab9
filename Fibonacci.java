public class Fibonacci{
  
    public int Fib(int i){
      if(i==1){
       return 0; 
      }
      if(i==2){
        return 1; 
      }
      return Fib(i-1)+Fib(i-2);
      
      
    }
    
    
  }
  
  
  
