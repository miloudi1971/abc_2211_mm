package procedure_inversion_deux_valeur;

import java.util.Scanner;

/*
PROCEDURE
	inversion(entier a, entier b)
	entier tmp
	tmp<--a
	a<--b
	b<--tmp
	ecrire "Aprés la permutation: nombre1 = ",a," nombre2 =",b
FIN PROCEDURE
DEBUT DU PROGRAMME
	nombre1 est un entier
	nombre2 est un entier
	ecrire "veuillez saisir le premier nombre
	lire nombre1
	ecrire "veuillez saisir le deuxieme nombre
	lire nombre2
	ecrire "Avant la permutation: nombre1 = ",nombre1," nombre2 =",nombre2
	inversion(nombre1,nombre2)
	
FIN DU PROGRAMME
	 */
	

public class App {

	public static void inversion(int a, int b)
	{
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("Apres la permutation: nombre1 = "+a+" nombre2 ="+b);
	}
	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner Sc = new Scanner(System.in);
		System.out.println("veuillez saisir le premier nombre ");
		a = Sc.nextInt();
		System.out.println("veuillez saisir le deuxieme nombre");
		b = Sc.nextInt();
		inversion(a, b);
		Sc.close();
	}

}
