package coding;
//WOOHOOOO :D
/*Given a binary tree, print it vertically. The following example illustrates vertical order traversal.*/
import java.util.*;

public class HorizontalDistanceBinTree {
	
	
	private static class Node{
		int data;
		Node leftChild;
		Node rightChild;
		
		public Node(int data){
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
	}

	public static void getVerticalOrder(Node root, int hd, Map<Integer, ArrayList<Integer>> vertDis){
		 if(root == null) return;
		 
		 if(vertDis.containsKey(hd)){
			 ArrayList<Integer> values = (ArrayList<Integer>) vertDis.get(hd);
			 values.add(root.data);
			 vertDis.put(hd,values);
			 
		 }
		 else{
			 ArrayList<Integer> values = new ArrayList<Integer>();
			 values.add(root.data);
			 vertDis.put(hd,values);
		 }
			 
		  
		 //System.out.println("hd" + hd + "root" + root.data);
		 
		 getVerticalOrder( root.leftChild, hd-1, vertDis );
		  
		  
		 getVerticalOrder( root.rightChild, hd+1, vertDis); 
	}
	
	public static void printVerticalOrder(Node root){
		Map<Integer, ArrayList<Integer>> vertDis = new HashMap<Integer, ArrayList<Integer>>();
		int hd = 0;
		
		getVerticalOrder(root,hd,vertDis);
//		for(Map.Entry<Integer, Vector<Integer>> entry : vertDis.entrySet()){
//			System.out.println("Key:" + entry.getKey() + "Value:" + entry.getValue());
//		}
		Iterator it = vertDis.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
		
	}
	
	
	public static void main(String[] args){
		
	//	HorizontalDistanceBinTree hdbt = new HorizontalDistanceBinTree();
		
		 Node root = new Node(1);
		 root.leftChild = new Node(2);
		 root.rightChild = new Node(3);
		 root.leftChild.leftChild = new Node(4);
		 root.leftChild.rightChild = new Node(5);
		 root.rightChild.leftChild = new Node(6);
		 root.rightChild.rightChild = new Node(7);
		 root.rightChild.leftChild.rightChild = new Node(8);
		 root.rightChild.rightChild.rightChild = new Node(9);
		
		 printVerticalOrder(root);
	}
	

}

