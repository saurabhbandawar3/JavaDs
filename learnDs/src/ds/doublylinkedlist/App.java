package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkList thelist = new DoublyLinkList();
		
		thelist.insertFirst(10);
		thelist.insertFirst(20);
		thelist.insertFirst(30);
		
		thelist.insertLast(40);
		thelist.insertFirst(50);
		thelist.insertFirst(60);

		thelist.displayForword();
		thelist.displayBackword();
		
		thelist.deleteFirst();
		thelist.deleteLast();
		
		thelist.displayForword();
		
		thelist.insertAfter(20, 44);
		thelist.insertAfter(50, 99);
		
		thelist.displayForword();
		
		
	}

}
