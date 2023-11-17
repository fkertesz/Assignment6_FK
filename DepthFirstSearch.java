/**
 * Class for depth first search in a tree.
 * @author Fanni Kertesz
 * @version 11/16/23
 */
public class DepthFirstSearch {       
	Node root;
	int n = 1;
	
	public DepthFirstSearch()
	{               
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}
	
	/**
	 * method for depth-first search (pre-order)
	 * @param node used to search
	 */
	public void DFS(Node node){

		if (node == null)
		{
			return;
		}
		System.out.println("Data from node traversed: " + node.getData());
		System.out.println("Number of nodes traversed: " + n++);
		
		//traverses the left child
		DFS(node.getlChild());

		//traverses the right child
		DFS(node.getrChild());
	}//end DFS
			
	/**
	 * method for getting the height of the tree
	 * @param node to traverse with
	 * @return height of tree
	 */
	public int getHeight(Node node) {
		int leftH = 0;
		int rightH = 0;
		int max = 0;
		
		//checks if node is leaf
		if(node == null) 
			return 0;

		//get left and right height
		leftH = getHeight(node.getlChild());
		rightH = getHeight(node.getrChild());

		//find right height of the tree
		if(leftH >= rightH)
			max = leftH;
		else 
			max = rightH;
		return max + 1;
	}//end getHeight


}