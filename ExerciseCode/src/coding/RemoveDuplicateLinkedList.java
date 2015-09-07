package coding;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicateLinkedList {
	static class Node{
		int data;
		public Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		public void addToTail(int d){
			Node node = new Node(d);
			Node current = this;
			while(current.next != null){
				current = current.next;
			}
			current.next = node;
		}
	}
	public static void removeDuplicate1(Node head){
		Set<Integer> set = new HashSet<Integer>();
		set.add(head.data);
		Node previous = head;
		Node current = previous.next;
		while(current != null){
			if(!set.contains(current.data)){
				set.add(current.data);
				previous = previous.next;
				current = current.next;
			}else{
				System.out.println("Delete " + current.data);
				current = current.next;
				previous.next = current;
			}
		}
	}
	public static void removeDuplicate2(Node head){
		Node previous = head;
		Node current = head.next;
		while(current != null){
			Node runner = head;
			while(!(runner == current)){
				if(runner.data == current.data){
					current = current.next;
					previous.next = current;
					break;
				}
				runner = runner.next;
			}
			if(runner == current ){
				previous = previous.next;
				current = current.next;
			}
			
		}
	}
	public static void main(String args[]){
		Node head = new Node(0);
		for(int i = 1; i < 21; i++){
			head.addToTail(i);
		}
		head.addToTail(0);
		head.addToTail(0);
		head.addToTail(0);
		head.addToTail(8);
		head.addToTail(0);
		head.addToTail(8);
		removeDuplicate1(head);
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
}