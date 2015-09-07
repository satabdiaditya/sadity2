package coding;
//NOT CORRECT
//searching for an element in a sorted array
public class BinSearch {
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int num = 7;
		
		binSearch(arr,num,0,arr.length-1);
	}
	
	public static void binSearch(int[] arr, int num, int front , int back){
		
		int mid = (back + front)/2;
		while(front<= back){
			 if ( arr[mid] < num )
			        front = mid + 1;    
			      else if ( arr[mid] == num ) 
			      {
			        System.out.println(num + " found at location " + (mid + 1) + ".");
			        break;
			      }
			      else
			         back = mid - 1;
			 
			 mid = (back + front)/2;
			   }
			   if ( front > back )
			      System.out.println(num + " is not present in the list.\n");
			  }
	
	}


