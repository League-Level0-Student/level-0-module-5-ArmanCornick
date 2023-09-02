package _01_algorithms._2_fibonacci;

public class Retyery {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int sum = x+y;


		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<100;i++) {
			System.out.println(sum);
			x = y;
			y = sum;
			sum = x+y;
		}






















	}
}
