package calcul_interet;

import java.util.Scanner;

public class App {
	/*
	   Lire la somme S placée sur un compte, l'intérêt i offert par la banque et le nombre N d'années de placement de la somme S.
       Calculer et afficher la valeur acquise par la somme S placée pendant N années :
       ▪ avec un intérêt simple : S ( 1 + N * i )
       ▪ avec un intérêt composé : S ( 1 + i )
	 */

	public static void main(String[] args) {
		 //variable
		int somme;
		int nombreAnnée;
		int tauxIntéret;
		double intéreSimple;
		double intéreComposé;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("calcul d'intérêt");
		
		System.out.println("veuillez saisir la somme que vous souhaitez placée");
		somme = sc.nextInt();
		
		System.out.println("veuillez saisir le nombre d'année de placement");
		nombreAnnée =  sc.nextInt();
		
		System.out.println("veuillez saisir le taux d'intérêt");
		tauxIntéret = sc.nextInt();
		
		intéreSimple = somme*(1 + nombreAnnée * tauxIntéret/100d);
		System.out.println("le montant de l'intérêt simple est: " + intéreSimple + " euro");
		
		intéreComposé = somme*Math.pow((1 + tauxIntéret/100d),nombreAnnée);
		System.out.println("le montant de l'intérêt compsé  est: " + intéreComposé + " euro");
		
		sc.close();
	}

}
