package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList mylist = new SinglyLinkedList();
		mylist.insertFirst(10);
		mylist.insertFirst(20);
		mylist.insertFirst(30);
		mylist.insertFirst(40);
		
		
		mylist.insertLast(60);
		
		mylist.display();
	}

}
