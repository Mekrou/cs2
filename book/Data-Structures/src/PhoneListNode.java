public class PhoneListNode {
    private String name;
    private String phone;
    private PhoneListNode next;

    public PhoneListNode(String s1, String s2) {
        name = s1;
        phone = s2;
        next = null;
    }

    public void setData(String s1, String s2) {
        name = s1;
        phone = s2;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return name + " " + phone;
    }

    public String toString() {
        return name + " " + phone;
    }

    public void setNext(PhoneListNode next) {
        this.next = next;
    }

    public PhoneListNode getNext() {
        return this.next;
    }
}
