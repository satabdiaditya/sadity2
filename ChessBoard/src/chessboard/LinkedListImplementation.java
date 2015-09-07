package chessboard;

public class LinkedListImplementation {
	private static Node head;
	
	public LinkedListImplementation(){
		head = null;
	}
	
	public void add(int data){
		if(head == null){
			head = new Node(data,null);
		}
		else{
			Node tmp = head;
			while(tmp.next != null) tmp = tmp.next;
			Node newNode = new Node(data,null);
			tmp.next = newNode;
		}
		
	}
	
	public void print(){
		Node tmp = head;
		while(tmp != null){
			System.out.println(tmp.item);
			tmp = tmp.next;
		}
		System.out.println(head.item);
	}
	
	public void addAfter(int after, int data){
		System.out.println("ancd");
		Node tmp = head;
		while(tmp.item != after) tmp = tmp.next;
		Node temp = new Node(data,tmp.next);
		tmp.next = temp;
	}
	//Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
	public void deleteNode(Node n){
		n.item = n.next.item;
		Node temp = n.next.next;
		//delete(n.next);
		n.next = temp;
		
		
	}
	
	public static Node getNode(int data){
		System.out.println("aaaa");
		Node n;
		Node tmp = head;
		while(tmp.item != data ) tmp = tmp.next;
		n = tmp;
		return n;
	}
	private static class Node{
		int item;
		Node next;
		
		public Node(int data, Node next){
			this.item = data;
			this.next = next;
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("Begin Implementation");
		LinkedListImplementation list = new LinkedListImplementation();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.print();
		//Node n = getNode(3);
		list.addAfter(3, 1000);
		list.print();
		
		
		
	}

}

