package fonction_moyenne_deux_nombre;

import java.util.Scanner;

/*
   	 algorithime fonction calcul de la moyenne deux nomnre
   	 
   	 
         réel fontion 
             moyenne (réel a, réel b, ) ;
             réel resultat ;
              retourn resultat = (a + b)/2 ;
             
          Fin fonction;
                
           debut de programme 
                a est un réel;
                b est un réel;
                m est reel;
                ecrire  veuillez saisir la valeur de a ;
                lire a
                ecrire  veuillez saisir la valeur de b ; 
                lire b
                m<--moyenne(a,b)
                Ecrire "la moyenne est" ,m
                
           fin de programme 
 */

public class App {
	
	 public static double moyenne(double a, double b)
	 {
		 double resultat  = (a + b)/2;
		 return resultat;
	 }

	public static void main(String[] args) {
		
		double m;
		double a;
		double b;
		Scanner Sc = new Scanner(System.in);
		System.out.println("veuillez saisir la valeur de a ");
		a = Sc.nextDouble();
		System.out.println("veuillez saisir la valeur de b ");
		b = Sc.nextDouble();
		
		m = moyenne(a, b);
		System.out.println("la moyenne  de a et b est : "+ m);
		Sc.close();

	}

}
