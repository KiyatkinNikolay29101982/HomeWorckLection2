package Home_Worck_2;
import java.util.Scanner; 

public class Task11 {
	public static void main(String [] args) {
		System.out.println("Task11");
		System.out.println("������� ���������� ������ �� ������ ����");
		Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        int day = second/86400;
        int hour = (second % 86400)/ 3600;
        int minute = ((second % 86400) % 3600)/60;
        int seconds = ((second % 86400 ) % 3600 ) % 60;

        System.out.println("�� ������ ���� �������� " + day + " ���� " + hour + " ����� " + minute + " ����� " + seconds + " ������");
        sc.close();
    }

}
