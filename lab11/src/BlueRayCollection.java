public class BlueRayCollection {
    private Node head;

    public BlueRayCollection() {
        this.head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(String title, String director, int releaseDate, double cost) {
        Node current = head;
        BlueRayDisk disk = new BlueRayDisk(title, director, releaseDate, cost);
        Node newNode = new Node(disk);
        if (isEmpty()) {
            this.head = newNode;
            return;
        } 

        while (current.next != null)
            current = current.next;

        current.next = newNode;
    }

    public void show_all() {
        Node current = head;
        if (isEmpty()) {
            System.out.println("The collection is empty.");
            return;
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
