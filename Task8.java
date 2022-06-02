package Home_Worck_2;

import java.util.Scanner;

public class Task8 {
	final int SOUND_SPEED = 343; //  m/s
    int time;  // s

    public Task8() {
       Scanner sc = new Scanner(System.in);
       this.time = sc.nextInt();
       sc.close();

    }

    public int compute() {
        return (time * SOUND_SPEED);
    }

    public static void main(String[] args) {
    	System.out.println("Task8");
        Task8 a = new Task8();
        System.out.println("Расстояние до точки разряда  = " + a.compute() + " m.");
    }

}
