package book.Node;

public class NodeImpl
{
    private String data;
    private Object nextObject;

    public NodeImpl()
    {
        this.data = null;
        this.nextObject = null;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return this.data;
    }
    public void setNext(Object next) {
        this.nextObject = next;
    }
    public Object getNext() {
        return nextObject;
    }

}