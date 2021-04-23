import java.util.Scanner;

public class Task1{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int i= sc.nextInt();
    Factorial f = new Factorial();

    System.out.print( f.fact(i));
    
  }
  
  
}