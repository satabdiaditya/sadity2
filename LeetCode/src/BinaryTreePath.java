/*Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]*/
public class BinaryTreePath {
	public static void main(String[] args){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);
		printPaths(root);
	}
	
	public static void printPaths(TreeNode node) 
	{
	  int[] path = new int[1000];
	  printPathsRecur(node, path, 0);
	}
	public static void printPathsRecur(TreeNode node, int path[], int pathLen) 
	{
	  if (node==null) 
	    return;
	 
	  /* append this node to the path array */
	  path[pathLen] = node.val;
	  pathLen++;
	 
	  /* it's a leaf, so print the path that led to here  */
	  if (node.left==null && node.right==null) 
	  {
	    printArray(path, pathLen);
	  }
	  else
	  {
	    /* otherwise try both subtrees */
	    printPathsRecur(node.left, path, pathLen);
	    printPathsRecur(node.right, path, pathLen);
	  }
	}
	
	public static void printArray(int ints[], int len) 
	{
	  int i;
	  for (i=0; i<len; i++) 
	  {
	    System.out.println(ints[i]);
	  }
	 System.out.println("\n");
	} 

}

class TreeNode{
	
	 int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
	
}
