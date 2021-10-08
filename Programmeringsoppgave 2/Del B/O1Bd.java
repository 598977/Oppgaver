package no.hvl.dat100;

public class O1Bd {

public static void main (String[] args) {
		
		
		
		
	}
	
public static boolean erLik(int[][] mat1, int[][] mat2) {
	
	int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] b = {{2,5,7}, {3,7,1}, {5,9,2}};
		
	boolean lik = true;	
	int x = a.length;
	int y = b.length;
	
	for (int i=0; i<x && lik; i++) {
		for (int j=0; j<y && lik; j++) {
			if (a[i][j] != b[i][j]) {
				lik = false;
			}
		}
	}
	return lik;
}
}
