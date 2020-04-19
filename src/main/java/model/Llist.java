package model;

public class Llist {
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    Node head;
    public  Llist(){
        head = null;
    }
}
