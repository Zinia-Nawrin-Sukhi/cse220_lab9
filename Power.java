public class Power{
  
    public int Multiple(int m,int n){
      

        if(n>0){

    return m*Multiple(m,n-1);
      
    }
         return 1; 
    } 
    
  }
  