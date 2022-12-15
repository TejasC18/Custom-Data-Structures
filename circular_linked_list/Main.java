package circular_linked_list;

public class Main
{
	public static void main(String[] args)
	{
		CircularLinkedLIist cll = new CircularLinkedLIist();
		cll.createNode(10);
		// it's proved that it is a circular linked list
		cll.insertNode(20,1);
		cll.insertNode(30,2);
//		System.out.println(cll.head.value);
//		System.out.println(cll.head.next.value);
//		System.out.println(cll.head.next.next.value);
//		System.out.println(cll.head.next.next.next.value);
//		System.out.println(cll.head.next.next.next.next.value);
		cll.insertNode(40,0);
		cll.display();
	}

}
