package Home_Worck_2;

public class Task10 {
	public static void main(String[] args) {
        final int HEIGHT = 185;
        final int WEIGHT = 95;
        int idealWeight = HEIGHT - 110 ;

        if (WEIGHT > idealWeight) {
            System.out.printf("��� ��� ���� �����, ��� ����� ������� %d ��. ", WEIGHT - idealWeight);
        } else if(WEIGHT < idealWeight) {
            System.out.printf("��� ��� ������ �����. ��� ����� ������� %d ��", WEIGHT - idealWeight);
        } else {
            System.out.println("��� ��� �������");
        }

    }

}
