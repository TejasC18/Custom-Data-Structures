package Queue;

public class QueueArray
{
	int[] arr;
	int Front;
	int Rear;

	public QueueArray(int size)
	{
		this.arr = new int[size];
		this.Front = -1;
		this.Rear = -1;
//		System.out.println("The queue is successfully created with size of " + size);
	}

	public boolean isEmpty()
	{
		if ((Front == -1))
		{
			return true;
		} else
		{
			return false;
		}
	}

	public boolean isFull()
	{
		if (Rear == arr.length - 1)
		{
			return true;
		} else
		{
			return false;
		}
	}

	public void enQueue(int value)
	{
		if (isFull())
		{
			System.out.println("The queue is full");
		} else if (isEmpty())
		{
			Front = 0;
			Rear++;
			arr[Rear] = value;
//			System.out.println(value + " is inserted successfully");
		} else
		{
			Rear++;
			arr[Rear] = value;
//			System.out.println(value + " is inserted successfully");
		}
	}

	public int deQueue()
	{
		if (isEmpty())
		{
			System.out.println("The queue is empty");
			return -1;
		}

		else
		{
			int result = arr[Front];
			Front++;
			if (Front > Rear)
			{
				Front = Rear = -1;
			}
			return result;
		}

	}

	public void deleteQueue()
	{
		arr = null;
		System.out.println("The Queue is deleted ");
	}

	public void printQueue()
	{
		for (int i = Front; i < Rear + 1; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
