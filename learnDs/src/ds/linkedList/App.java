package ds.linkedList;

public class App {

	public static void main(String[] args) {
		
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB= new Node();
		nodeA.data = 3;
		
		Node nodeC = new Node();
		nodeA.data = 7;
		
		Node nodeD = new Node();
		nodeA.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
	}

	

	public static int listLength (Node anode) {
		int length = 0;
		Node currentNode = anode;
		while(currentNode !=null) {
			length++; 
			currentNode = currentNode.next;
		}
		return length;
	}		
}
