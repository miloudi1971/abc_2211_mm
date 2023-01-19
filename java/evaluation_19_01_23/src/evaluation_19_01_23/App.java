package evaluation_19_01_23;

import java.util.Scanner;

/*
  VARIABLE 
  
  numéro du mois est un entier
  nom du mois string
  numero du jour est un entier
  
  DEBUT DE PROGRAMME
  
  écrire "veuillez saisir le numero du mois"
	 
  lire numero du moi
          si mois est 1 alors
 	         écrire le mois de janvier  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28
 	  
 	        sinon si mois est 2 alors 
 	             ecrire le de fevrier est les jous impairs sont: 1,5,7,11,13,17,19,23,25
 	             
 	         sinon si  mois est 3 alors
 	          écrire le mois de mars  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28 
 	          
 	          sinon si mois est 4 alors 
 	             ecrire le de avril est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29
 	          
 	           si mois est 5 alors
 	         écrire le mois de mai  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28
 	         
 	         sinon si mois est 6 alors 
 	             ecrire le de juin est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29
 	         
 	          si mois est 7 alors
 	         écrire le mois de juillet  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28
 	         
 	         sinon si mois est 8 alors 
 	             ecrire le de aout est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29,31
 	         
 	          si mois est 9 alors
 	         écrire le mois de septembre  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28
 	         
 	         sinon si mois est 10 alors 
 	             ecrire le de octobre est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29,31
 	          
 	          si mois est 11 alors
 	         écrire le mois de novembre  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28
 	         
 	         sinon si mois est 12 alors 
 	             ecrire le de decembre est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29,31
 	       fin si
   FIN PROGRAMME
 */

public class App {

	public static void main(String[] args) {
		 /*
		  *   numéro du mois est un entier
              nom du mois string
              numero du jour est un entier
		  * */
        int num;
        String nom;
        int j;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir le numero du mois");
		num = sc.nextInt();
		
		if(num==1) {
			System.out.println("le mois de janvier  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28");
			}
  
		else if(num==2) {
			System.out.println("le de fevrier est les jous impairs sont: 1,5,7,11,13,17,19,23,25");
			}
             
		else if (num==3) {
			System.out.println("le mois de mars  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28");
			} 
          
          else if (num==4) {
        	  System.out.println("le de avril est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29");
        	  }
          
             else if (num==5) {
            	 System.out.println("le mois de mai  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28");
            	 }
         
         else if (num==6) {
        	 System.out.println("le de juin est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29");
        	 }
         
             else if (num==7) {
            	 System.out.println("le mois de juillet  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28");
            	 }
         
         else if (num==8) {
        	 System.out.println("le de aout est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29,31");
        	 }
         
             else if (num==9) {
            	 System.out.println("le mois de septembre  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28");
            	 }
         
         else if (num==10) {
        	 System.out.println("le de octobre est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29,31");
        	 }
          
             else if (num==11) {
            	 System.out.println("le mois de novembre  est impair, les jours pairs sont: 2,4,6,8,12,14,16,18,22,24,26,28");
             }
         
         else if (num==12) { 
        	 System.out.println("le de decembre est les jous impairs sont: 1,5,7,11,13,17,19,23,25,29,31");
        	 }
		sc.close();
       
		
	}

}
