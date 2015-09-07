package chessboard;
import java.io.*;
import java.util.*;

public class Heap {
	public int[] arrHeap;
	public int size;
	public int maxSize;
	
	private static final int FRONT = 1;
	
	public Heap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		arrHeap = new int[this.maxSize+1];
		arrHeap[0] = Integer.MAX_VALUE;
	}
	
	public void print(){
	 for(int i = 1; i<(size/2); i++){
		 System.out.println("Parent :"+ arrHeap[i]);
		 System.out.println("Left Child :"+ arrHeap[2*i]);
		 System.out.println("Right Child :"+ arrHeap[2*i+1]);
		 
		 
	 }
	}
	
	private int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
	 public boolean isLeaf(int pos)
	    {
	        if (pos >=  (size / 2)  &&  pos <= size)
	        { 
	            return true;
	        }
	        return false;
	    }
	
	 public void maxHeapify(int pos)
	    {
	        if (!isLeaf(pos))
	        { 
	            if ( arrHeap[pos] < arrHeap[leftChild(pos)]  || arrHeap[pos] < arrHeap[rightChild(pos)])
	            {
	                if (arrHeap[leftChild(pos)] > arrHeap[rightChild(pos)])
	                {
	                    swap(pos, leftChild(pos));
	                    maxHeapify(leftChild(pos));
	                }else
	                {
	                    swap(pos, rightChild(pos));
	                    maxHeapify(rightChild(pos));
	                }
	            }
	        }
	    }
	 
	
	public void insert(int element){
		
		size = size+1;
		arrHeap[size] = element;
		int current = size;
		while(arrHeap[current] < arrHeap[current/2]){
			swap(current,current/2);
			current = current/2;
			
		}
	}
	public void swap(int i, int j){
		int temp;
		temp = arrHeap[i];
		arrHeap[i] = arrHeap[j];
		arrHeap[j] = temp;
		
	}
	
	public int remove()
    {
        int popped = arrHeap[FRONT];
        arrHeap[FRONT] = arrHeap[size--]; 
        maxHeapify(FRONT);
        return popped;
    }
	
	 public void maxHeap()
	    {
	        for (int pos = (size / 2); pos >= 1 ; pos--)
	        {
	            maxHeapify(pos);
	        }
	    }
	 
	 //to do - insert new key and delete a number
	 
	public static void main(String[] args){
		System.out.println("Hello World");
		Heap heap = new Heap(15);
		heap.insert(5);
		heap.insert(12);
		heap.insert(64);
		heap.insert(1);
		heap.insert(37);
		heap.insert(90);
		heap.insert(91);
		heap.insert(97);
		System.out.println("Insert");
		System.out.println(heap.size);
		heap.maxHeap();
		heap.print();
		System.out.println("The Max val is " + heap.remove());
		
	}
}
