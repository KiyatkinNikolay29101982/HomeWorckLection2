package Home_Worck_2;

import java.util.Scanner;

public class Task5 {
	private double radius; 
	final double PI = 3.14; 
	
	public Task5() {
		System.out.println("������� ������ ����������"); 
		Scanner sc = new Scanner(System.in);
		this.radius = sc.nextDouble(); 
		sc.close();
	}
	
	public void computeCircle(double a) {
		double lengthOfCircle = 2 * radius * PI; 
		double areaOfCircle = radius * radius * PI;
		System.out.println("����� ���������� = " + lengthOfCircle);
		System.out.println("������� ����� = " + areaOfCircle); 
	}
	
	public static void main(String[] args) {
		System.out.println("Task5");
		Task5 cir = new Task5(); 
		cir.computeCircle(cir.radius); 
		
	}

}
