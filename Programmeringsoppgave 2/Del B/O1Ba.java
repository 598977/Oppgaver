package no.hvl.dat100;

public class O1Ba {
	
	public static void main (String[] args) {
		
		int[][] matrise = {{2,5,7}, {3,7,1}, {5,9,2}};
		
		
	}
	
	public static void skrivUtv1(int[][] matrise) {
	
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}
}
