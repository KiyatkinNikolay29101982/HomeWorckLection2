package Home_Worck_2;

public class Task2 {
	
	
	public int compute (int n) {
		int rezultOfTask2 = 0; 
		while(n != 0) {
			rezultOfTask2 = rezultOfTask2 + (n % 10); 
			n /= 10; 
			
		}
		
		return rezultOfTask2; 
	}
	
	public static void main(String[] args) {
		
		Task2 a = new Task2(); 
		System.out.print(a.compute(123)); 
	}

}
// решил через цикл while(немного знаком с ним), т.к. n целочисленное число, усли его бесконечно делить
// 10 в итоге n через приведение к типу int получим и цикл прекратиться. А схема /10  позволяет разбить
//число на разряды. 