package no.hvl.dat100;

public class O1Bb {
	
	public static void main (String[] args) {
		
		int[][] matrise = { {1,2,3}, {4,5,6}, {7,8,9} };
			
	}
	
	public static String tilStreng(int[][] matrise) {
	
		String streng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				streng = streng + matrise[i][j] + " ";
			}	
			streng = streng + "\n";
		}		
		return streng;		
	}
}
