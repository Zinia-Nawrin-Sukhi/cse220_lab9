public class Binary{
  
    public String BinaryConverter(int i){
      

        if(i>0){

    return (( BinaryConverter(i/2))+" "+(i%2));
      
    }
         return " "; 
    } 
    
  }
  
  