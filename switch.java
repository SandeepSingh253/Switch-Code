
class SwitchTest{
	
	public static void main(String args[]){
		
		int[] marks={34,54,99,100,76,89,72,28,1,9999};
		
		for(int i=0;i<marks.length;i++){
			printGrade(marks[i]);
		}

	}		
	
	static void printGrade(int marks){
		int input=marks/10;
		switch(input){
			
			case 0:
			case 1: 
			case 2: 		
			case 3: 	
			case 4: System.out.println("Marks scored "+marks+" grade is F");
					break;
			
			case 5: System.out.println("Marks scored "+marks+" grade is E");
					break;
					
			case 6: System.out.println("Marks scored "+marks+" grade is D");
					break;
					
			case 7: System.out.println("Marks scored "+marks+" grade is C");
					break;
					
			case 8: System.out.println("Marks scored "+marks+" grade is B");
					break;
					
			case 9: 
			case 10: System.out.println("Marks scored "+marks+" grade is A");
					break;	
			default: System.out.println("Invalid marks should be between 0-100");
		}
		
	}
	
}