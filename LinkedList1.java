public class LinkedList1{
  public Node1 head;
  public LinkedList1(Object [] a){
  
    Node1 n =new Node1(a[0],null);
   head=n;
//    for(int i=1;i<a.length;i++){
//      Node1 x=new Node1(a[i],null);
//n.next=x;
//n=x;
//    }
  }
  
    public LinkedList1(Node1 h){
    head=h;
   }
    public void addElem(Node1 h){
      if(h==null){
        System.out.print(0);
    }
      else{
      System.out.print(head.element+" ");
      addElem(head.next);
      }
  }
}