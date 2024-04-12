public class PhoneList {
    private PhoneListNode head;

    public PhoneList() {
        head = null; // S t a r t w i t h e m p t y l i s t
    }

    public boolean isEmpty() { // D e f i n e s an empty l i s t
        return head == null;
    }

    public void insert(PhoneListNode node) {
        if (isEmpty()) {
            this.head = node;
            node.setNext(null);
        } else {
            PhoneListNode currNode = this.head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(node);
        }
    }

    public String getPhone(String name) {
        if (isEmpty())
            return "List is empty!";

        PhoneListNode current = this.head;
        PhoneListNode target = null;
        while (current != null) {
            if (current.getName().equals(name)) {
                target = current;
                break;
            }
            current = current.getNext();
        }

        if (target == null)
            return "Could not find " + name;
        else
            return target.toString();
    }

    /*
     * Four cases:
     * 1. Empty
     * 2. Tried to remove first element
     * 3. Removed correct element
     * 4. Element could not be found
     */
    public String remove(String name) {
        if (isEmpty())
            return "List is empty";

        PhoneListNode current = this.head;
        PhoneListNode previous = null;

        if (current.getName().equals(name)) {
            this.head = current.getNext();
            return "Successfully removed " + name;
        }

        while (current != null && !current.getName().equals(name)) {
            previous = current;
            current = current.getNext();
        }

        if (current == null)
            return name + " could not be found.";
        if (current.getNext() == null && previous == null)
            return "Cannot remove the only element";
        else {
            previous.setNext(current.getNext());
            current = null;
            return "Successfully removed " + name;
        }
    }

    // public String remove ( String name ) { }
    public void print() {
        if (isEmpty())
            System.out.println("List is empty");
        PhoneListNode currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode);
            currNode = currNode.getNext();
        }
    } // P h o n e L i s t
}