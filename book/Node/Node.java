package book.Node;

import book.Node.NodeImpl;

public class Node
{
    public static void main(String[] args)
    {
        NodeImpl newNode = new NodeImpl();
        newNode.setData("Hello.");
        System.out.println(newNode.getData());
    }
}