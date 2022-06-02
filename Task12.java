package Home_Worck_2;

import java.util.Scanner;


public class Task12 {
	double numOfschoollboy; 
	final double VOLUEM_OF_PACK_OF_MILK = 0.9;
	final double PORTION_OF_MILK = 0.2;
	double numOfPacOfMilk;
	
	public Task12(int numOfschoollboy) {
		this.numOfschoollboy = numOfschoollboy; 
	
		}
	
	public double compute() {
		double voluemOfMilk = numOfschoollboy * 0.2 ;
		
		numOfPacOfMilk = voluemOfMilk / VOLUEM_OF_PACK_OF_MILK;
		
		return numOfPacOfMilk = Math.ceil(numOfPacOfMilk);
	}
	
	public static void main(String[] args) {
		Task12 a = new Task12(28);
		Scanner scanner = new Scanner(System.in); 
		System.out.println("процент детей с недобором массы тела");
		String procent = scanner.next(); 
		
		switch(procent) {
			case("100") : System.out.println(a.compute()); 
		            break; 
			case("60") : System.out.println(Math.ceil(a.compute() * 0.6)); 
			        break;
			case("1") : System.out.println(Math.ceil(a.compute() * 0.01)); 
			break; 
		      
		}
		
		scanner.close();
		
	}

}
