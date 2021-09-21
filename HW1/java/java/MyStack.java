

/**
 * @author Yuxiang Liu
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {
	
	 int size;
	 MyNode<T> top;

	 public class MyNode<T> {
		T val;
		MyNode<T> next;
	

      public MyNode(T v, MyNode<T> n) {
			val = v;
			next = n;
}
	
	public MyNode<T> getNext(){
		return next;
	}	
	public T getValue() {
		return val;
	
	}
 }

	private MyNode<T> theStack = null; 
	/**
	 * 
	 */
	public MyStack() {
		size = 0;
		top = null;
	}

	public T pop() {
		MyNode<T> oldTop = top;
		if (size==0) {
	    return null;
	    }
		top= top.getNext();
		size--;
		return oldTop.getValue();
		
		// TODO To complete
	}

	public void push(T v) {
		MyNode<T> newElement = new MyNode<T>(v, top);
		top= newElement;
		size++;
		// TODO To complete
	}
	public T peek() {
		if (size == 0) {
			return null;
		}
	    return top.getValue();
	}
   
    	
    
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack<Integer> intStack= new MyStack<Integer>();
		
		intStack.push(1);
		intStack.push(2);
		intStack.pop();
		intStack.push(5);
		intStack.pop();
		System.out.println(intStack.peek());
		
		MyStack<String> stringStack= new MyStack<String>();
		stringStack.push("Yuxiang Liu");
		stringStack.push("Christelle Scharf");
		System.out.println(stringStack.peek());
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
	}

}
