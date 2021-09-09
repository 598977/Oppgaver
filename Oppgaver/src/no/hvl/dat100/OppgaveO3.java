package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {
	
	public static void main(String[] args) {
		String tall = showInputDialog ("Skriv in heltall:");
		int n = parseInt (tall);
		int y = n;
		int x = 1;
		
		if(n>0){
			while(n>1) {
				x *= n;
				n--;
			}
			System.out.println(y + "! = " + x);
		}
		else {
			showMessageDialog(null, "Error, n skal være større enn 0");
		}
	}

}
