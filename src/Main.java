import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    
    Map<String, String> map = new HashMap<>();
    map.put("hello", "hi");
    
    Main m = new Main();
    while ((line = in.readLine()) != null) {
      m.printMaxValues(line);
      // System.out.println(line);
      
      
    }
  }
  
  public static void printMaxValues(String line) {
     String[] split = line.split(":"); 
     String s1 = split[0];
     int w = Integer.parseInt(s1.trim());
     
     String s2 = split[1]; 
     String s3 = s2.replace('$', ' ');
     String s4 = s3.replace('(', ',');
     String s5 = s4.replace(')', ' ');
     String s6 = s5.replaceFirst(",", "");
    
     String[] split2 =s6.split(",");
     int length = split2.length;
     String[] data = new String[length];
     
     int i =0;
     for (String string : split2 ){
       data[i++] = string.trim();
     }
     int arrayLength = length/3;
     i =0;
     int[] index = new int[arrayLength];
     for ( int j =0 ; j < length ; j = j+3) {
       index[i++] = Integer.parseInt(data[j]);
     }
     
     i =0;
     double[] weight = new double[arrayLength];
     for ( int j =1 ; j < length ; j = j+3) {
       weight[i++] = Double.parseDouble(data[j]);
     }
     
     i=0;
     double[] cost = new double[arrayLength];
     for ( int j =2 ; j < length ; j = j+3) {
       cost[i++] = Double.parseDouble(data[j]);
     }
    
    int maxValue = findMaxValue(w,weight, cost, arrayLength ) ;
    System.out.println(maxValue);
  }   
     
     static int findMaxValue( double weight, double w[], double[] cost, int n) {
       if( n ==0 || weight == 0 )
            return 0;
            
        if(w[n-1] > weight ){
          return findMaxValue (weight, w, cost, n-1);
        } else {
          return (int) max(cost[n-1] + findMaxValue(weight-w[n-1], w, cost, n-1),
                findMaxValue(weight, w, cost, n-1) );
        }
          
     }
     
     
     static double max (double d1, double d2) {
       return (d1>d2)?d1:d2;
     }

}













/*import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	*//**
	   * Iterate through each line of input.
	   *//*
	  public static void main(String[] args) throws IOException {
	    String line;
	      Main m = new Main();
	      int findDuplicate = m.findDuplicate("20;0,1,10,3,2,4,5,7,6,8,11,9,15,12,13,4,16,18,17,14");
	      System.out.println(findDuplicate);
	  }
	  
	  public void findDuplicate(String line) {
	    String temp =  line.split(";")[1];
	    String[] values = temp.split(",");
	    
	    for (String string : values) {
			System.out.println(Integer.parseInt(string));
		}
	    
	  }
	
	  
	  public int findDuplicate(String line) {
		    String temp =  line.split(";")[1];
		    String[] values = temp.split(",");
		    int length = values.length;
		    int[] nums = new int[length];
		    Set<Integer> set = new HashSet();
		    int value = 0;
		    for(int i=0; i < length; i++  ) {
		    
		         nums[i] = Integer.parseInt(values[i]);
		         System.out.println(nums[i]);
		         if(!set.add(nums[i])){
		           return value;
		         }
		    }
		    System.out.println(value);
		    return value;
		  }
	
	
	
	
	
  *//**
   * Iterate through each line of input.
   *//*
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		String line;
		int sum = m.getSum(Integer.parseInt("10"));
		System.out.println(sum);
	}
  
  public int getSum (int number) {
	  System.out.println(" inside get sum "+number);
    int sum=0;
    if (number == 0 || number ==1) {
        return number;
    }
    int i =1;
    while ( i <= number){
      if(i%5 == 0|| i%7==0 ){
    	  i++;
        continue;
      } else {
        sum = sum + i;
      }
      i++;
    }
     System.out.println(sum);
    return sum;
    
  }
}
*/