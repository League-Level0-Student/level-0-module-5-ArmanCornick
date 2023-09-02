package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Thijnf {
	public static void main(String[] args) {
int x = 0;
		for(int i=10000000;i<1000000000;i++) {
			for(int z=2;z<i/2;z++) {
				if(i%z==0) {
					break;	
				}
				if(z+1==i/2) {
					if(x==25) {
					x = 0;
					System.out.println(" " + i);
					}
					else {
					System.out.print(" " + i);
					}
					x ++;
					
				}
			}
		}





























	}
}
