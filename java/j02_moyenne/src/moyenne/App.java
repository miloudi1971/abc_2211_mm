package moyenne;

import java.util.Scanner;

public class App {
	 /*
	  1.1	algorithime calcul de la moyenne
    variable nombre 1 : entier  , nombre2 : entier  , Moyenne : réel
    debut
      ecrire  veuillez saisir le premier nombre ;
      lire N1
      ecrire  veuillez saisir la deuxième nombre ; 
      lire N2
      Moyenne = (N1 + N2)/2
      Ecrire la moyenne est ; 
    fin
    */

	public static void main(String[] args) 
	{ 
		// variales 
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc = new Scanner(System.in);  // permet de lire des saisies utilisateur
		System.out.println("algorithime calcul de la moyenne");
		
		System.out.println("veuillez saisir le premier nombre");
		
		nombre1 = sc.nextInt();
		System.out.println("vous avez saisi: " + nombre1);
		
		System.out.println("veuillez saisir la deuxiéme nombre");
		nombre2 = sc.nextInt();
		System.out.println("vous avez saisi: " + nombre2);
		
		moyenne = (nombre1 + nombre2) / 2d;
				
		System.out.println("la moyenne est : " + moyenne);
		  
		sc.close();
	}

}
