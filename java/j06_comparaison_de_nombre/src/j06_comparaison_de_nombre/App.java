package j06_comparaison_de_nombre;

import java.util.Scanner;

/* VARIABLE
        age est un entier
   DEBUT DE PROGRAMME
        écrire " veullez saisir votre age"
        lire age
        
        si age < 0
                alors afficher " vous n'étes pas encore né.e."
        sinon si age < 18
                alors afficher " vous étes mineur.e."
        sinon afficher " vous étes majeur.e."
   
   FIN DE PROGRAMME
 
 */

public class App {

	public static void main(String[] args) {
		
		int a;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("veuillez saisir votre age");
		a = sc.nextInt();
		
		if(a<0) {
			System.out.println("vous n'étes pas encore né");
		}
		else if(a<18) {
			System.out.println("vous étes mineur");
		}
		else {
			System.out.println("vous étes majeur");
		}
		sc.close();
	}
		

}
