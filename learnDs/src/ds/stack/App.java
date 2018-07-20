package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(4);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		 reverseString ("Hello");
		 
	}
	public static void reverseString (String str) {
		int stackSize =str.length();
		StackS theStack = new StackS(stackSize);
		
		
		
		for(int i=0;i<str.length();i++){
			char ch= str.charAt(i);
			theStack.push(ch);
		}
		String result ="";

		while(!theStack.isEmpty()) {
			char ch  = theStack.pop();
			System.out.print(result+ch);
		}
		
	}

}
