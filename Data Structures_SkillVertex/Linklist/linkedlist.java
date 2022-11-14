import java.util.*;
public class linkedlist{
    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
            Node head;
            Node tail;
            int size;
// ========================== ADD===========================
            void addFirst(int val){
                Node node = new Node();
                node.data = val;

                if(head == null && tail ==  null){
                    head = tail = node;
                    size++;
                }

                else{
                    node.next = head;
                    head = node;
                    size++;
                }

            }

            void addLast(int val){
                Node node = new Node();
                node.data = val;
                    if(head==null && tail == null){
                      
                        head = tail = node;
                      
                    }
                    else{
                       
                        tail.next = node;
                        tail = node;
                       
                    }
                    size++;
            }

            void addAt(int val,int idx){
                if(idx<0||idx>size){
                    System.out.println("Invalid index");
                }
               else if(size == 0){
                    System.out.println("LinkedList has no elements");
                }
                else if(idx == 0){
                    addFirst(val);
                }
              else if(idx == size){
                  addLast(val);
              }
              else{
                Node node = new Node();
                node.data = val;
                  Node temp = head;
                  for(int i = 1;i<=idx-1;i++){
                        temp = temp.next;
                  }
                  // right connection
                  node.next = temp.next;
                  // left connection
                  temp.next = node;
                  size++;
              }
            }
//=====================Get======================================================

    void getFirst(){
        System.out.println(head.data);
    }
    void getLast(){
        System.out.println(tail.data);
    }
    void getAt(int idx){
        Node temp = head;
        for(int i = 1;i<=idx;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
//===========================REMOVE===========================================
    void removeFirst(){
        if(size ==0){
            System.out.println("Invalid call");
        }
        else if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        else{
            head = head.next;
            size--;
        }

    }
    void removeLast(){
        if(size ==0){
            System.out.println("Invalid call");
     
        }
        else if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i = 1;i<=size-2;i++){
                temp = temp.next;
            }
            temp.next = null;
            size--;

        }
    }
        void removeAt(int idx){
            if(size ==0){
                System.out.println("Invalid call");
         
            }
           else if(idx<0||idx>=size){
                System.out.print("Invalid indices");
            }
            else if(idx == 0){
                removeFirst();
            }
            else if(idx == size -1){
                removeLast();
            }
            else{
                Node temp = head;
                for(int i = 1;i<=idx - 1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
        //=====================================================
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
        }
    }
    

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);   
        ll.addAt(40,1);    
         ll.display(); 
         System.out.println();
        //  ll.getFirst();
        //  ll.getLast();
        //  ll.getAt(2);
       
       ll.removeFirst();
       ll.display(); 
       System.out.println();

       ll.removeLast();
       ll.display(); 
       System.out.println();

       ll.removeAt(0);
       ll.display(); 
       System.out.println();
    }
}