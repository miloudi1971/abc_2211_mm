package calcul_aire_secteur_circulaire;

import java.util.Scanner;

/*
 VARIABLES
 
 rayon est un reel
 angle est un entier
 surface est un reel
 
 CONSTANTE
 pi est un reel
 
 DEBUT DU PROGRAMME
 
 Ecrire "veuillez saisir le rayon : "
 lire rayon
 Ecrire "veuillez saisir l'angle : "
 lire angle
 
 surface <-- pi * rayon * rayon * angle / 360
 
 Ecrire "La surface est : ", surface
 
 
 FIN DU PROGRAMME
 */

public class App {

	public static void main(String[] args) {
		
		double rayon;
		int angle;
		double surface;
		final double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("veullez saisir le rayon");
		rayon = sc.nextInt();
		System.out.println("veuillez saisir l'angle");
		angle = sc.nextInt();
		
		surface = pi * rayon * rayon * angle / 360;
		System.out.println("la surface est " + surface);
		
		sc.close();
	}

}
