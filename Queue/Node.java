public class Node {
    private Statist content;
    private Node next;
   
    public Node(Statist content) {
        this.content = content; 
        next = null; 
    }

     public Statist getContent() {
        return this.content;
    }

    public void setContent(Statist content) {
        this.content = content;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
