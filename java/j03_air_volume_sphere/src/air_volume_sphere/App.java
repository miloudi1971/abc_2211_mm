package air_volume_sphere;

import java.util.Scanner;

public class App { 
	/*
	    EXERCICE 1.2 : CALCUL DE L’AIRE ET DU VOLUME D’UNE SPHERE
	  
        Lire le rayon R d'une sphère puis calculer et afficher :
        ▪ Son aire = 4 π R²
        ▪ Son volume =𝟒/3πR3

     */

	public static void main(String[] args) 
	{
		// variable 
		double rayon;
		double pi = Math.PI;
		double aire;
		double volume;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCUL DE L’AIRE ET VOLUME D’UNE SPHER");
		
		System.out.println("veuillez saisir le rayon");
		rayon = sc.nextInt();
		System.out.println("vous avez saisi le rayon: "+ rayon);
		
		// En Java, a^b s'écrit : Math.pow(a,b) 
		
		aire = 4*pi*Math.pow(rayon, 2);
		System.out.println("l'aire de la sphere est: " + aire);
		
		volume = 4/3*pi*Math.pow(rayon, 3);
		System.out.println("le volume de la sphere est: " + volume);
		
		sc.close();

	}

}
