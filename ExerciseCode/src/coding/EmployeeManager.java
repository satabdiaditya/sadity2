package coding;

//Find number of Employees Under every Employee
import java.util.*;

public class EmployeeManager {

	public static void main(String[] args){
		Map<String,String> empMapping = new HashMap<String,String>();
		Map<String,ArrayList<String>> empManager = new HashMap<String,ArrayList<String>>();
		empMapping.put("A", "C");
		empMapping.put("B", "C");
		empMapping.put("C", "F");
		empMapping.put("D", "E");
		empMapping.put("E", "F");
		empMapping.put("F", "F");
		
		mapManagerstoDirectEmps(empMapping,empManager);
		
		countEmployees(empMapping,empManager);
		Iterator it1 = empManager.entrySet().iterator();
	    while (it1.hasNext()) {
	        Map.Entry pair = (Map.Entry)it1.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it1.remove(); // avoids a ConcurrentModificationException
	    }
		
	
	}
	
	public static void countEmployees(Map empMapping , Map empManager){
		Iterator it = empMapping.entrySet().iterator();
//		 while (it1.hasNext()) {
//		        Map.Entry pair = (Map.Entry)it1.next();
//		        
//		    }
		
	}
	
	public static void mapManagerstoDirectEmps(Map empMapping, Map empManager){
	
		
		Iterator it = empMapping.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			//ArrayList<String> emps = new ArrayList<String>();
			 if(empManager.containsKey(pair.getValue())){
				 ArrayList<String> emps = (ArrayList<String>) empManager.get(pair.getValue());
				 emps.add((String) pair.getKey());
				 empManager.put((String) pair.getValue(),emps);
				 
			 }
			 else{
				 ArrayList<String> emps = new ArrayList<String>();
				 emps.add((String) pair.getKey());
				 empManager.put((String) pair.getValue(),emps);
			 }
			
			
		}
//		Iterator it1 = empManager.entrySet().iterator();
//	    while (it1.hasNext()) {
//	        Map.Entry pair = (Map.Entry)it1.next();
//	        System.out.println(pair.getKey() + " = " + pair.getValue());
//	        it1.remove(); // avoids a ConcurrentModificationException
//	    }
 
		
	}
}
