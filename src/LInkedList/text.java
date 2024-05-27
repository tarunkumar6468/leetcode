package LInkedList;

import java.util.Scanner;

class Node {
    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }

    public void setData(int d) {
        data =d;
    }
    public void setNext(Node n){
        next = n;
    }
    public int getData(){
        return (data);
    }
    public Node getNext(){
        return (next);
    }


}
class LinkedList{
    Node node = new Node();
    private int size;
    private Node Start;
    public LinkedList(){
        size = 0;
        Start = null;
    }

    public void insertAtFirst(int val){
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(Start);
        size++;
    }
    public void insertAtLast(int val){
        Node n,t;
        n = new Node();
        n.setData(val);
        t = Start;
       if(t == null){
           Start = n;
       }
       else{
           while (t.getNext()!=null){
               t = t.getNext();
               t.setNext(n);
           }
           size++;
       }
    }
    public void insertAtPos(int val, int pos){
        if(pos == 1){
            insertAtFirst(val);
        }
        else if(pos == size+1){
            insertAtFirst(val);
        }
        else if(pos>1 && pos <=size){
        Node n,t;
        n = new Node(val,null);
        t  = Start;
        for(int i = 1;i<pos-1;i++){
            t = t.getNext();
        }
        n.setNext(t.getNext());
        t.setNext(n);
        size++;
        }
        else {
            System.out.println("Insertion not possible at position " +pos);
        }
    }
    public void deleteAtPos(int pos){
        if(Start==null) System.out.println("list is already empty");
        else if(pos<1 && pos>size)
            System.out.println("invalid position");
        else if(pos == 1)deleteFirst();
        else if(pos == size)
            deleteLast();
        else{
            Node t,t1;
            t = Start;

            for(int i = 0; i<pos-1; i++){
                t = t.getNext();
                t1 = t.getNext();
                t1.setNext(t1.getNext());
                size--;
            }
        }
    }
public void deleteLast(){
    if(Start==null){
        System.out.println("list is already empty");
    }
    else if(size==1){
        Start=null;
        size--;
    }
    else{
        Node t;
        t = Start;
        for(int i = 1; i<size-1; i++) t = t.getNext();
        t.setNext(null);
        size--;
    }
}
    public void deleteFirst(){
        if(Start==null){
            System.out.println("list is already empty");
        }
        else {
            Start = Start.getNext();
            size--;
        }
    }
    public boolean isEmpty(){
        if(Start==null)return(true);
        return false;
    }
    public int getListSize(){
        return size;
    }
    public void  viewList(){
    Node node  = Start;
        for(int i = 1; i<=size; i++) {
            System.out.println(" " + node.getData());
            node  = node.getNext();
        }
    }
}
public class text {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    list.insertAtPos(1,1);
    list.insertAtPos(2,2);
    list.insertAtPos(3,3);
    list.insertAtPos(4,4);
    list.insertAtPos(5,5);
    list.insertAtPos(6,6);
    list.insertAtPos(7,7);
    list.insertAtPos(8,8);
    list.insertAtPos(9,9);
    list.insertAtPos(10,10);
    list.insertAtPos(11,11);
    list.insertAtPos(12,12);
    System.out.println(list.getListSize());
    list.viewList();
}
}
