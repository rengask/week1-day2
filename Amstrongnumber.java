package week1.day2;

public class Amstrongnumber {

	public static void main(String[] args) {
		 int in = 154;
		 int cal = 0;
		 int rem;
		 int original = in;
		 while(in > 0){
			 rem = in % 10;
			in = in / 10;
			cal=cal+(rem*rem*rem);
		 }
		 if(cal==original) {
			 System.out.println("Amstrong number");
		 }
		 else {
			 System.out.println("Not an amstrong number");
		 }
		 
			 
		 }
		 
		 
		 

	}

