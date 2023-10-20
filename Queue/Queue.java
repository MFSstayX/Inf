public class Queue{
    private Node head; 
    private Node tail; 
    public Queue() {
        head = null; 
        tail = null;
    }
    public void enqueue(Statist statist) {

    }
    public void dequeue() {

    }
    public Statist front() {
        if(head != null) {
        return head.getContent(); 
        }
        return null; 
    }
    public boolean isEmpty() {
       return head == null; 
    }

}