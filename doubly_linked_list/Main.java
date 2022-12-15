package doubly_linked_list;

public class Main
{

	public static void main(String[] args)
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.createNode(10);
		dll.insertDLL(20, 1);
		dll.insertDLL(30, 2);
		System.out.println(dll.head.value);

		dll.traverseDLL();
		dll.reverseTraverseDLL();
	}

}
