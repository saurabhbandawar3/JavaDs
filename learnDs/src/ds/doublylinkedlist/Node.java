package ds.doublylinkedlist;

public class Node {
	public int data;
	public Node next= null;
	public Node previous;
	
	public void displayNode() {
		System.out.println("{"+ data +"}");
	}
}
