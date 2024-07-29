package Java_Basic;

//public class Sum_Arrays {
	class Pen {
	    String color;
	    String type;
	    
	    public void write(){
	        System.out.println("writing something");
	    }
	    
	    public void printColor(){
	        System.out.println(this.color);
	       
	  
	        
	    }
	}


	public class me {
	public static String activity;
		public static void act() {
			activity="wqdw";
			System.out.println(activity);
		}
		
		
	    public static void main(String args[]){
	       Pen pen1 = new Pen();
	       pen1.color = "blue";
	       pen1.type = "gel";
	       act();
	    

	      Pen pen2 = new Pen();
	      pen2.color = "black";
	      pen2.type = "ballpen";
	      
	      pen1.printColor();
	      pen2.printColor();
	     
	       
	    }
	}
//public static void main(String[] args) {
//	int[] arr = new int[] {5,8,9,5,8};
//	int sum=0;
////	for(int i =0;i<5;i++) {
////		 sum = sum+arr[i];
////	}
//	
//	for(int j:arr) {
//		sum=sum+j;
//	}
//	
//	
//	
//	
//	System.out.println("The sum of array is :" +sum);
//}
//}
