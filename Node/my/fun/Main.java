package Node.my.fun;

public class Main {
    public static void main(String[] args) {
        mylinkedlist list =new mylinkedlist();
        list.insert(1);
        list.insert(2);


       list.removeNthFrontEnd(1);
        System.out.println(list);
    }
}
