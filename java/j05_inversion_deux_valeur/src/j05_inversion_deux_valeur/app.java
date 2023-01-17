package j05_inversion_deux_valeur;

import java.util.Scanner;

/* VARIABLE
         a est un entier
         b est un entier
         c est un entier
   DEBUT DU PROGRAMME
         ecrire "veullez saisir la valeur de a ";
         lire a ;
         ecrire "veullez saisir la valeur de b ";
         lire b
         c <-- a;
         a <-- b;
         b <-- c;
         ecrire " a "
         ecrire " b "
   FIN DE PROGRAMME
 */
public class app {

	public static void main(String[] args) {
		// declaration des variables
		
		int a;
		int b;
		int c;
		
		Scanner Sc = new Scanner(System.in);
		 
		System.out.println("veuillez saisir la valeur de a :");
		a = Sc.nextInt();
		
		System.out.println("veuillez saisir la valeur de b :");
		b = Sc.nextInt();
		
		System.out.println("Avant la permutation: a = "+a+" et b = "+b);
		c = a ;
		a = b ;
		b = c;
		
		System.out.println("Apres la permutation: a = "+a+" et b = "+b);
		Sc.close();
		
				
						
		
		
		

	}

}
