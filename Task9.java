package Home_Worck_2;

import java.util.Scanner; 
public class Task9 {

    public static void main(String[] args) {
    	System.out.println("Task 8");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = (int) a;
        System.out.println(b);
        sc.close();
        System.out.println(a - b); 
      if (a - b > 0) {
           System.out.println("число имеет вещественную часть");
        } else {
            System.out.println("число не имеет вещественную часть");
        }
    }
}
