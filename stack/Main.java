package stack;

public class Main {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		
		boolean result = st.isEmpty();
		System.out.println(result);
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		st.pop();
		st.push(60);
//		System.out.println(st.peek());
//		System.out.println(st.pop());
//		System.out.println(st.peek());
		
//		int peek2 = st.peek();
		st.printStack();
//		st.deleteStack();
//		
//		int peek3 = st.peek();
//		System.out.println(peek3);
	
	}

}

