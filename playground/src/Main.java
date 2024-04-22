

class Node {
  public char letter;
  public Node next;

  public Node(char letter) {
    this.letter=letter;
    next=null;
  }
}
class Main {
  public static void dostuff(Node head) {
    if(head!=null) {
      dostuff(head.next);
      System.out.print(head.letter);
    }
  }  

  public static void main(String[] args) {
    Node head = null;

    head=new Node('A'); 
    head.next=new Node('B');
    head.next.next=new Node('C');
    head.next.next.next=new Node('D');
    head.next.next.next.next=new Node('E');

    dostuff(head);
  }
}

