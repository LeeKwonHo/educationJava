package arrayeducation;

public class ArrayEdu {
	
	int[] arr = new int[10];
	int[] arrEven = new int[10];
	int max;
	
	
	public ArrayEdu() {
		int number;
		int indexOfEven = 0;
		
		for(int i = 0; i <arr.length; i++) {
			
			number = (int)(Math.random()*100)+1;
			arr[i] = number;
			
			if(0 == number % 2) {
				
				arrEven[indexOfEven] = number;
				indexOfEven++;
				
			}
		}
		
	}
	
	void getMax() {
		max = 0;
		int next = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			max = arr[i];
			next = arr[i+1];
			
			if(max < next) {
				max = next;
				i++;
			}
			
			
			
			
			
		}
		System.out.println(max);
	}
		
	
		
	




























}


