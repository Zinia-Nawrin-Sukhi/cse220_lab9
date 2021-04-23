public class Array{
  
    public void  PrintAll(int i[],int n){
//      if(i.length==n){
//     System.out.println();
//      }
     if(n==(i.length-1)){
        System.out.print(i[n] );
      }
      else{
       
     System.out.print(i[n]+" ");
         PrintAll(i,++n);
      }
      
    }
    
    
  }
  
  
  
