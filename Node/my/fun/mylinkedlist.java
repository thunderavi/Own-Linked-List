package Node.my.fun;

 class Node{
    public int data;
    public Node next=null;
    public Node(int data){
        this.data=data;
    }
}

public class mylinkedlist {
     private Node head;
     private Node tail;

     public  mylinkedlist(){
         head=null;
         tail=null;
     }
     public void insert(int value){
         Node node =new Node(value);
            if (isEmpty()){
                head=tail=node;

            }else {
                 tail.next=node;
                 tail=node;
            }
     }
     public void reverse(){
         if (head==null || head.next==null)return;

         Node prev=null;
         Node current=head;
         Node next=head.next;
         while (next!=null){
            current.next=prev;
            prev=current;
            current=next;
            next=next.next;
         }
         current.next=prev;
         head=current;
     }
     public void insertFirst(int value){
         Node node= new Node(value);
         if (isEmpty()){
             insert(value);
             return;
         }
         node.next=head;
         head=node;
     }

     public  boolean isEmpty(){
         return head ==null && tail ==null;
     }
     public void removeStart(){
         if (isEmpty()) return;
         Node temp=head;
         head=head.next;
         temp.next=null;

     }
     public void removeEnd(){
         if (isEmpty()) return;;
         if(head==tail){
             head=tail=null;
             return;
         }
         Node current =head;
         while(current.next!=tail){
             current=current.next;

     }
         current.next=null;
         tail=current;

    }

     public int sum(){
         Node current =head;
         int sum=0;
         while (current!=null){
             sum+=current.data;
             current=current.next;
         }
         return sum;
     }

     public  void removeNthFrontEnd(int n){
         if(isEmpty()) return;
         if (head.next == null) {
         head=null;
         return;}
         int totalNodes=0;
         Node current =head;
         while (current!=null){
             totalNodes++;
             current=current.next;
         }
         int indexFromFront=totalNodes-n+1;
         Node prev=null;
         current=head;
         while(indexFromFront >1 && current!=null){
             prev=current;
             current=current.next;
             indexFromFront--;
         }
         prev.next =current.next;
         current.next=null;

     }
     public int indexof(int value){
         int index=0;
         Node current =head;
         while (current!=null){
             if (current.data == value) return index;
             index++;
             current=current.next;
         }
         return -1;
     }
     public void insertAt(int index,int value){
         if (isEmpty() )throw new IllegalArgumentException();
         Node node = new Node(value);
         Node current=head;
         Node prev=null;

         while(index>0 && current!=null){
             prev=current;
             current=current.next;
             index--;
         }
         prev.next=node;
         node.next=current;
     }
     public String toString(){
         Node current =head;
         StringBuilder result=new StringBuilder();

         while (current!=null){
             result.append(current.data);
             if (current.next!=null)
                 result.append(" --> ");
             current=current.next;
         }
         return result.toString();
     }

}
