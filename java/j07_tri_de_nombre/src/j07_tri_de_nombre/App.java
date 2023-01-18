package j07_tri_de_nombre;

import java.util.Scanner;

/* VARIABLE 
 
         a est entier
         b est entier 
         
   DEBUT DE PROGRAMME
         
          écrire " veuillez saisir la valeur de a "
          lire a
          écrire " veuillez saisir la valeur de b "
          lire b
          
          DEBUT SI 
                  SI a > b
                  ALORS 
                      afficher b puis a 
                  SINON
                      afficer a puis b
          FIN SI
    FIN DE PROGRAMME
*/
public class App {

	public static void main(String[] args) {
		 
		int a;
		int b;
			
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("tri de nombre");
        
        System.out.println ("veuillez saisir la valeur de a");
        a = sc.nextInt();
        
        System.out.println ("veuillez saisir la valeur de b");
        b = sc.nextInt();
        
        if (a > b) 
        {
        	System.out.println(b+" , "+a);
        }
        else
        {
        	System.out.println(a+" , "+b);
        }
        sc.close();
	}

}
