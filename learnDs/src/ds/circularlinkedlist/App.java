package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
			CircularLinkedList mylist = new CircularLinkedList();
			mylist.insertFirst(10);
			mylist.insertFirst(20);
			mylist.insertFirst(30);
			mylist.insertFirst(40);
			
			
			mylist.insertLast(60);
			
			mylist.display();
		}
	

}
