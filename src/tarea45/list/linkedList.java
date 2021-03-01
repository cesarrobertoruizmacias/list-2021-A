package tarea45.list;
/*
lista doblemente ligada
 */
public class linkedList {

    private Node head;
    private Node tail;
    private int size;

    public void add(int dato){
        Node node = new Node(dato);

        node.setPrevious(tail);
        if(tail != null){
            tail.setNext(node);
        }
        if(head == null){
            head = node;
        }
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }
}
