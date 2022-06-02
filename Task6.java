package Home_Worck_2;

public class Task6 {
	final int h = 12;
	final int w = 10;

	public void computeRectangle() {
		int perimeterOfRectangle = 2*(h + w);
		int areaOfRectangle = h * w;
		System.out.printf("периметр прямоугольника =%s%d%sплощадь прямоугольника = %d",
				" ", perimeterOfRectangle, " ", areaOfRectangle); 
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Task6");
		Task6 a = new Task6();
		a.computeRectangle();

	}

}
