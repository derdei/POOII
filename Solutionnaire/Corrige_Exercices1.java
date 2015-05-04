/**
 * Exercices 1: Méthodes
 * 
 * Pour chacun des problèmes suivants :
 * 
 * 1. Identifier les entrées/sorties de la méthode en dessinant la boîte noire.
 * 
 * 2. Écrire l'algorithme de la méthode.
 * 
 * 3. Coder la méthode en Java.
 * 
 * 
 */


	/**
	 * 1. Écrire une méthode qui retourne la somme de tous les nombres compris
	 * entre 2 entiers a et b inclusivement. Par exemple, si a vaut 8 et b vaut
	 * 5, la valeur retournée serait 26 (5+6+7+8).
	 * 
	 * <pre>
	 * 					        ----------------------
	 *                  a ---> |                      |
	 *                         |   additionnerEntre   |---> somme
	 *                  b ---> |                      |
	 *                          ----------------------
	 *   	additionnerEntre(a,b)
	 *         somme = 0
	 *        
	 *         Si (a>b)
	 *             temp = a
	 *             a = b
	 *             b = temp
	 *         Fin si
	 *         
	 *         Pour i variant de a à b
	 *             somme = somme + i
	 *         Fin pour
	 *         
	 *         retourner somme
	 * </pre>
	 * 
	 * @param a un entier.
	 * @param b un entier.
	 * 
	 * @return int, la somme des valeurs.
	 */
	public static int additionnerEntre(int a, int b)
	{
		int somme = 0;
		int temp = 0;

		// Inverser les valeurs si a est plus grand que b
		if (a > b)
		{
			temp = a;
			a = b;
			b = temp;
		}

		// Faire la somme
		for (int i = a; i <= b; i++)
		{
			somme = somme + i;
		}

		return somme;
	}

	/**
	 *2. Écrire une méthode qui retourne la puissance a exposant b où a et b
	 * sont 2 entiers. La valeur de b doit être positive. Par exemple, si a vaut
	 * 3 et b vaut 4, la valeur retournée serait 81 (3*3*3*3).
	 * 
	 * <pre>
	 *                   	    ----------------------
	 *                  a ---> |                      |
	 *                         |   calculerPuissance  |---> puissance
	 *                  b ---> |                      |
	 *                          ----------------------
	 *   	calculerPuissance(a,b)
	 *         puissance = 1
	 *         
	 *         Si (b>=0)
	 *             Pour i variant de 1 à b
	 *                 puissance = puissance*a
	 *             Fin pour
	 *         Fin si
	 *         
	 *         retourner puissance
	 * </pre>
	 * 
	 * @param base un entier, la base
	 * @param exp un entier, l'exposant
	 * 
	 * @return int, un entier la puissance
	 */
	public static int calculerPuissance(int base, int exp)
	{
		int puissance = 1;

		// L'esposant doit-être positif
		if (exp >= 0)
		{
			// Calcul de la puissance
			for (int i = 1; i <= exp; i++)
			{
				puissance = puissance * base;
			}
		}

		return puissance;
	}

	/************************************************************************
	 * 3. Écrire une méthode qui générera une chaîne de caractères *
	 * représentant un rectangle de largeur l et de hauteur h où l et h doivent
	 * être des entiers positifs. Par exemple, si l vaut 5 et h vaut 2, la
	 * chaîne retournée serait:
	 * 
	 * <pre>
	 *  			*****
	 * 			***** 
	 * 
	 * 			    ----------------------
	 *                  l ---> |                      |
	 *                         |   genererRectangle   |---> chaîne
	 *                  h ---> |                      |
	 *                          ----------------------
	 *   	genererRectangle(l, h)
	 *         chaine = ""
	 *        
	 *         Si (l>0 et h>0)
	 *             Pour ligne variant de 1 à h
	 *                 Pour colonne variant de 1 à l
	 *                     chaine = chaine + "*"
	 *                 Fin pour
	 *                 changer de ligne
	 *             Fin pour
	 *         Fin si
	 *         
	 *         retourner chaine
	 * </pre>
	 * 
	 * @param l un entier, la longueur
	 * @param h un entier, la hauteur
	 * 
	 * @return string, une chaîne de caractères représentant le rectangle
	 *         d'étoile.
	 */
	public static String genererRectangle(int l, int h)
	{
		String chaine = "";

		// Les deux valeurs doivent-être positives
		if ((l > 0) && (h > 0))
		{
			// Construction du rectangle
			for (int ligne = 1; ligne <= h; ligne++)
			{
				for (int colonne = 1; colonne <= l; colonne++)
				{
					chaine = chaine + "*";
				}
				
				chaine = chaine + "\n";
			}
		}

		return chaine;
	}

	

	

	/**
	 * 4. Écrire une méthode qui retourne une chaîne avec les n premiers nombres
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
	 * 		genererFibonacci (n)
	 * 			chaine = ""
	 * 			
	 * 			Si (n > 0)
	 * 				selon n
	 * 				cas 1 : 
	 * 					chaine = "1"
	 * 				cas 2 : 
	 * 					chaine = "1 1"
	 * 				defaut :
	 * 					n1 = 1
	 * 					n2 = 1
	 * 	
	 * 					pour i variant de 3 à n
	 *     					somme = n1 + n2
	 *     					n1 = n2
	 *      				n2 = somme
	 *  		   			chaine = chaine + " " + somme
	 * 					Fin pour
	 * 				Fin selon
	 * 			Fin si                       
	 * 			
	 * 			retourner chaine
	 * </pre>
	 * 
	 * @param n un entier, le nombre d'elements dans la suite.
	 * 
	 * @return string, une chaine avec les nombres de la suite
	 */
	public static String genererFibonacci(int n)
	{
		String chaine = "";
		int n1 = 0;
		int n2 = 0;
		int somme = 0;

		// Seulement si "n" est positif.
		if (n > 0)
		{
			switch (n)
			{
				// Deux cas particuliers
				case 1:
				{
					chaine = "1";
				}
				case 2:
				{
					chaine = "1 1";
					// Cas général pour n plus grand que 2
				}
				default:
				{
					n1 = 1;
					n2 = 1;
					chaine = "1 1";
	
					// Construction de la suite dans le cas général
					for (int i = 3; i <= n; i++)
					{
						somme = n1 + n2;
						n1 = n2;
						n2 = somme;
						chaine = chaine + " " + somme;
					}
				}
			}
		}

		return chaine;
	}

	
