
public class AddDigits {
	public static void main(String[] args){
		int number = 10;
		System.out.println(addNum(number));
	}
	
	public static int addNum(int num){
		
		while (num>=10) {num =addNumDigits(num);}
		return num;
	}
	
	public static int addNumDigits(int num){
		int sum = 0;
		System.out.println(num);
		while(num>=10){
			sum = sum + num%10;
			num = num/10;
		}
		sum = sum + num;
		System.out.println(sum);
		return sum;
	}
	
}
