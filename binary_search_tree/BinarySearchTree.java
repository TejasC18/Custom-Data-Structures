package binary_search_tree;

public class BinarySearchTree
{
	BinaryNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	// insert method;
	public BinaryNode insertNode(BinaryNode currentNode, int value)
	{
		if (currentNode == null)
		{
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			return newNode;
		} else if (value <= currentNode.value)
		{
			currentNode.left = insertNode(currentNode.left, value);
			return currentNode;
		}

		else
		{
			currentNode.right = insertNode(currentNode.right, value);
			return currentNode;
		}

	}

	public void insert(int value)
	{
		root = insertNode(root, value);
	}

	// pre-order travelsal method
	public void preOrder(BinaryNode node)
	{
		if (node == null)
		{
			return;
		}
		System.out.println(node.value); // it will print the root node value
		preOrder(node.left);
		preOrder(node.right);
	}
}
