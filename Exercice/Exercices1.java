/**
 * Exercices 1:  Méthodes
 * 
 * Pour chacun des problèmes suivants :
 * 
 * 1. Identifier les entrées/sorties de la méthode en dessinant la boîte noire.
 * 
 * 2. Écrire l'algorithme de la méthode.
 * 
 * 3. Coder la méthode en Java.
 * 
  */
public class Exercices1
{
	/**
	 * 1. Écrire une méthode qui retourne le plus petit de 2 nombres entiers.
	 * Par exemple, si les 2 entiers sont 7 et 4, la valeur retournée serait 4.
	 * 
	 * <pre>
	 * 							----------------------
	 *                  a ---> |                      |
	 *                         |   trouverPlusPetit   |---> val
	 *                  b ---> |                      |
	 *                          ----------------------
	 * 	  
	 * 		trouverPlusPetit(a,b)
	 * 	        val = 0
	 * 
	 * 	        Si (a<b)
	 * 	            val = a
	 * 	        Sinon
	 * 	            val = b
	 * 	        Fin si
	 * 
	 * 	        retourner val
	 * 
	 * </pre>
	 * 
	 * @param a un entier.
	 * @param b un entier.
	 * 
	 * @return int, le nombre plus petit.
	 */
	public static int trouverPlusPetit(int a, int b)
	{
		int val = b; // La plus petite valeur

		// Évaluation des deux nombres.
		if (a < b)
		{
			val = a;
		}
		
		return val;
	}

	/**
	 * 2. Écrire une méthode qui retourne la somme de tous les nombres compris
	 * entre 2 entiers a et b inclusivement. Par exemple, si a vaut 8 et b vaut
	 * 5, la valeur retournée serait 26 (5+6+7+8).
	 * 
	 * <pre>
	 * 					        ----------------------
	 *                  a ---> |                      |
	 *                         |   additionnerEntre   |---> somme
	 *                  b ---> |                      |
	 *                          ----------------------
	 *   	



	/**
	 * 3. Écrire une méthode qui retourne la puissance a exposant b où a et b
	 * sont 2 entiers. La valeur de b doit être positive. Par exemple, si a vaut
	 * 3 et b vaut 4, la valeur retournée serait 81 (3*3*3*3).
	 * 
	 * <pre>
	 *                   	    ----------------------
	 *                  a ---> |                      |
	 *                         |   calculerPuissance  |---> puissance
	 *                  b ---> |                      |
	 *                          ----------------------
	 * 
	
	 * 4. Écrire une méthode qui générera une chaîne de caractères *
	 * représentant un rectangle de largeur l et de hauteur h où l et h doivent
	 * être des entiers positifs. Par exemple, si l vaut 5 et h vaut 2, la
	 * chaîne retournée serait:
	 * 
	 * <pre>
	 *  			*****
	 * 			***** 
	 * 
	 * 						    ----------------------
	 *                  l ---> |                      |
	 *                         |   genererRectangle   |---> chaîne
	 *                  h ---> |                      |
	 *                          ----------------------
	 *   	

	/**
	 * 5. Écrire une méthode qui retourne une chaîne avec les n premiers nombres
	 * de la suite de Fibonaci. Cette suite est la suivante : 1 1 2 3 5 8 13
	 * 21…. On commence avec deux 1 et par la suite, un nouveau nombre est
	 * toujours la somme des 2 précédents. La valeur de n doit être positive.
	 * Par exemple, si n vaut 7, la chaîne générée serait 1 1 2 3 5 8 13.
	 * 
	 * <pre>
	 * 			    ----------------------
	 * 			   |                      |
	 * 		n ---> |    genererFibonacci  |---> chaine
	 * 		   	   |                      |
	 *      		    ----------------------
	 
	 Exemple: genererFibonacci(10)
	 Résultat: 1 1 2 3 5 8 13 21 34 55

	
