package circular_linked_list;

public class CircularLinkedLIist
{
	public Node head;
	public Node tail;
	public int size;

	public Node createNode(int nodeValue)
	{
		head = new Node();
		Node newNode = new Node();
		newNode.value = nodeValue;
		newNode.next = newNode;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}

	// Insert Node
	public void insertNode(int nodeValue, int location)
	{
		Node newNode = new Node();
		newNode.value = nodeValue;
		if (head == null)
		{
			createNode(nodeValue);
		} else if (location == 0)
		{
			newNode.next = head;
			head = newNode;
			tail.next = head;
		} else if (location >= size)
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;

		} else
		{
			Node tempNode = head;
			int index = 0;
			while (index < location - 1)
			{
				tempNode = tempNode.next;
				index++;

			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
		size++;
	}

	// Print all elements in the linked list
	public void display()
	{
		Node temp = head;
		if (head == null)
		{
			System.out.println("List does not exist.");
		}
		if (head != null)
		{
			for (int i = 0; i < size; i++)
			{
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
		}
	}

}
