package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1Ad {
	
	public static void main (String[] args) {
		
		int tall = 0;
		int[] tabell = {2, 5, 7, 3, 7};
		boolean funnet = finnesTall(tabell, tall);
		System.out.println(funnet);
		
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		
	String tallTxt = showInputDialog("Gi et tall:");
	int leterEtter = parseInt(tallTxt);
	boolean funnet = false;
	int i = 0;
	
	while (!funnet && i<tabell.length) {
		if (tabell[i] == leterEtter)
			funnet = true;
		else
			i++;
	}
	return funnet;	
	}
}
