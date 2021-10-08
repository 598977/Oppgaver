package no.hvl.dat100;

public class O1Bc {
	
public static void main (String[] args) {
		
		int[][] matrise = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		
	}
	
public static int[][] skaler(int tall, int[][] matrise) {
	
	int x = matrise.length;
	int y = matrise[0].length;	
	int[][] matrise2 = new int[x][y];

	for (int i=0; i<x; i++) {
		for (int j=0; j<y; j++) {
			matrise2[i][j] = tall * matrise[i][j];
		}
	}
	return matrise2;
}
