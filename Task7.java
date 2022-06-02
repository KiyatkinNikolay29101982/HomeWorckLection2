package Home_Worck_2;

import java.util.Scanner;

public class Task7 {
	private double startClinteDepozite; 
	private double bankProcent;
	
	public Task7(double bankProcent) {
		this.bankProcent = bankProcent; 
		Scanner sc = new Scanner(System.in);
		startClinteDepozite = sc.nextDouble(); 
		sc.close();
		
	}
	
	
	
	public double getStartClinteDepozite() {
		return startClinteDepozite;
	}
	public void setStartClienteDepozite(double startClinteDepozite) {
		this.startClinteDepozite = startClinteDepozite;
	}
	public double getBankProcent() {
		return bankProcent;
	}
	public void setBankProcent(double bankProcent) {
		this.bankProcent = bankProcent;
	} 
	
	public double computeClientMany (int year) {
		
		double manyInTheEndOfYear = startClinteDepozite;
		
		for (int i = 0; i <= year -1; i ++ ) {
			
			manyInTheEndOfYear += manyInTheEndOfYear * bankProcent;
			
	     	}
		
		return manyInTheEndOfYear; 
	}
	
	public static void main(String[] args) {
		System.out.println("Task7"); 
		Task7 a = new Task7(0.07); 
		System.out.println(a.computeClientMany(2));
	}

}
