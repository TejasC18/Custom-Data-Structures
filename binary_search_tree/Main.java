package binary_search_tree;

public class Main
{

	public static void main(String[] args)
	{
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(52);
		bst.insert(40);
		bst.insert(58);
		bst.insert(45);
		bst.preOrder(bst.root);
	}

}
