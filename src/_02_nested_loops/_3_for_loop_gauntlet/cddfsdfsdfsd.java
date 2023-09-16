package _02_nested_loops._3_for_loop_gauntlet;

public class cddfsdfsdfsd {
	public static void main(String[] args) {

		for(int i=0;i<3;i++) {
			for(int f=0;f<3;f++) {
				System.out.print(i);
				System.out.println(f);		
			}
		}

		System.out.println();

		for(int i=1;i<4;i++) {
			for(int f=1;f<4;f++) {
				System.out.print(f+3*(i-1)+" ");		
			}
			System.out.println();
		}

		System.out.println();

		for(int i=1;i<11;i++) {
			for(int f=1;f<11;f++) {
				if(f+10*(i-1)<10) {
					System.out.print(f+10*(i-1)+" ");
				}
				else {
					System.out.print(f+10*(i-1));	
				}
			}
			System.out.println();
		}
		System.out.println();

































	}
}
