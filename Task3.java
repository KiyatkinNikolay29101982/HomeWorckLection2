package Home_Worck_2;

import java.util.Scanner; 

public class Task3 {
  public static void main(String[] args) {
	  System.out.println("Task3");
	  
	  System.out.println("введите число которое вы хотите округлить"); 
	  
	  Scanner sc = new Scanner(System.in); 
	  
	  double s = sc.nextDouble();
	  
	  System.out.println(Math.round(s));
	  sc.close();
  }
}
