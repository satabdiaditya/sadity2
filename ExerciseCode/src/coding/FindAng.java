package coding;

//finding the angle between hour and min (slightly wrong e.g. 12:15)

import java.util.*;

public class FindAng {
	
	public static void main(String[] args){
		String time = "7:00";
		String[] splitStr = time.split(":");
		String hours = splitStr[0];
		String mins = splitStr[1];
		findAngle(hours,mins);
	}
	
	public static void findAngle(String hours, String mins){
		int hourAngle = 0;
		int minAngle = 0;
		
		int hrs = Integer.valueOf(hours);
		int mns = Integer.valueOf(mins);
		hourAngle = ((hrs%12)*360/12);
		minAngle = (mns*360/60);
		
		System.out.println(hourAngle);
		System.out.println(minAngle);
		int difference = (minAngle - hourAngle);
		
		if (difference<0){
			difference = -(difference);
		
		}
			
		System.out.println(difference);
		
	}


}
