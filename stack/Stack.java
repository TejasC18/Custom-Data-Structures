package stack;

public class Stack
{
	int[] arr;
	int topOfStack;

	public Stack(int size)
	{
		this.arr = new int[size];
		this.topOfStack = -1;
	}

	// isEmpty() method
	public boolean isEmpty()
	{
		if (topOfStack == -1)
		{
			return true;
		} else
		{
			return false;
		}
	}

	public boolean isFull()
	{
		if (topOfStack == arr.length - 1)
		{
			return true;
		} else
		{
			return false;
		}
	}

	public void push(int value)
	{
		if (isFull())
		{
			System.out.println("The Stack is full");
		} else
		{
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("The Value is inserted successfully");
		}
	}

	public void pop()
	{
		if (isEmpty())
		{
			System.out.println("The stack is empty");
		} else
		{
			arr[topOfStack] = Integer.MIN_VALUE;
			topOfStack--;
		}
	}

	public int peek()
	{
		if (isEmpty())
		{
			System.out.println("The stack is empty");
			return -1;
		} else
		{
			return arr[topOfStack];
		}
	}

	public void printStack()
	{
		for (int j : arr)
		{
			if (j != Integer.MIN_VALUE)
			{
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}

	public void deleteStack()
	{
		arr = null;
		System.out.println("The stack is deleted");
	}
}
