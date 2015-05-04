/**
 * Exercices 2: Méthodes et Vecteurs
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

public class Exercices2
{

	/**
	 * 1. Écrire une méthode qui retourne un vecteur de n entiers dont les
	 * valeurs seront des nombres aléatoires compris entre 0 et 9 inclusivement.
	 * 
	 * <pre>
	 *                          ----------------------
	 *                         |                      |
	 *                 n --->  |   genererVecteur     |---> vect
	 *                         |                      |
	 *                          ----------------------
	 *                          
	 * 			genererVecteur (n)
	 *             créer un vecteur vect de dimension n
	 *             
	 *             pour i variant de 0 à n-1
	 *                 vect[i] = 10 * aléatoire[0,1[
	 *             Fin pour
	 *             
	 *             retourner vect
	 * <\pre>
	 * 
	 * @param n, le nombre de valeur dans le vecteur
	 * 
	 * @return un tableau de int le vecteur généré
	 */
	public static int[] genererVecteur(int n)
	{
		int[] vect = new int[n];

		// Boucle de génération des données
		for (int i = 0; i < n; i++)
		{
			vect[i] = (int) (10 * Math.random());
		}

		return vect;
	}

	

	/**
	 * 2. Écrire une méthode qui retourne la somme des valeurs d'un vecteur
	 * d'entiers.
	 * 
	 * <pre>
	 *                          ----------------------
	 *                         |                      |
	 *              vect --->  | additionnerVecteur   |---> somme
	 *                         |                      |
	 *                          ----------------------
	 *   	additionnerVecteur (vect)
	 *         somme = 0
	 *      
	 *         pour i variant de 0 à longueur du vecteur-1
	 *             somme = somme + vect[i]
	 *         Fin pour
	 *         
	 *         retourner somme
	 * </pre>
	 * 
	 * Nom : additionnerVecteur
	 * 
	 * @param vect, le vecteur à faire la somme
	 * 
	 * @return int, la somme
	 */
	public static int additionnerVecteur(int[] vect)
	{
		int somme = 0;

		// Boucle pour faire la somme du vecteur
		for (int i = 0; i < vect.length; i++)
		{
			somme = somme + vect[i];
		}

		return somme;
	}

	/**
	 * 3. Écrire une méthode qui retourne la valeur minimum d'un vecteur
	 * d'entiers.
	 * 
	 * <pre>
	 *                          ----------------------
	 *                         |                      |
	 *              vect --->  |    minimumVecteur    |---> min
	 *                         |                      |
	 *                          ----------------------
	 *   	minimumVecteur (vect)
	 *         min = vect[0]
	 *         
	 *         pour i variant de 1 à longueur du vecteur-1
	 *             Si vect[i] < min
	 *                 min = vect[i]
	 *             Fin si
	 *         Fin pour
	 *         
	 *         retourner min
	 * </pre>
	 * 
	 * @param vect, le vecteur
	 * 
	 * @return int, la valeur minimum
	 */
	public static int minimumVecteur(int[] vect)
	{
		int min = vect[0]; // On initialise la valeur min par la première valeur
							// du vecteur

		for (int i = 1; i < vect.length; i++)
		{
			if (vect[i] < min)
			{
				min = vect[i];
			}
		}

		return min;
	}

	
	/**
	 * 4. Écrire une méthode qui retourne la valeur du premier indice où se
	 * trouve l'entier x dans un vecteur d'entiers. Si la valeur de x ne se
	 * trouve pas dans le vecteur, retournez -1. Par exemple, si le vecteur
	 * contient 5 12 4 5 4 3 6, la valeur retournée serait 2 si x vaut 4, 1 si x
	 * vaut 12 et -1 si x vaut 2.
	 * 
	 * <pre>
	 *                          ----------------------
	 *                 x --->  |                      |
	 *              vect --->  |    chercherValeur    |---> indice
	 *                         |                      |
	 *                          ----------------------
	 *                          
	 *   	chercherValeur (x, vect)
	 *         indice = -1
	 *         
	 *         pour i variant de 0 à longueur du vecteur-1 
	 *             Si indice = -1
	 *                 Si vect[i] = x
	 *                     indice = i
	 *                 Fin si
	 *             Fin si
	 *         Fin pour
	 *         
	 *         retourner indice
	 * </pre>
	 * 
	 * @param x, la valeur à chercher
	 * @param vect, le vecteur dans lequel chercher
	 * 
	 * @return int, l'indice ou se trouve la valeur de x
	 */
	public static int chercherValeur(int x, int[] vect)
	{
		int indice = -1;

		for (int i = 0; ((i < vect.length) && (indice == -1)); i++)
		{
			if (vect[i] == x)
			{
				indice = i;
			}
		}

		return indice;
	}

	/**
	 * 5. Écrire une méthode qui retourne le nombre de fois où se retrouve le
	 * caractère x dans un vecteur de caractères. Par exemple, si le vecteur
	 * contient les caractères BONJOUR, la valeur retournée serait 2 si x vaut
	 * O, 1 si x vaut J et 0 si x vaut A.
	 * 
	 * <pre>
	 *                          ----------------------
	 *                 x --->  |                      |
	 *              vect --->  |    compterValeur     |---> nbFois
	 *                         |                      |
	 *                          ----------------------
	 *   	compterValeur (x,vect)
	 *         nbFois = 0
	 *        
	 *         pour i variant de 0 à longueur du vecteur-1 
	 *             Si vect[i] = x
	 *                 nbFois = nbFois +1
	 *             Fin si
	 *         Fin pour
	 *         
	 *         retourner nbFois
	 * </pre>
	 * 
	 * @param x, la valeur à chercher
	 * @param vect, le vecteur dans lequel chercher
	 * 
	 * @return, int, le nombre de fois où la valeur x est trouvée
	 */
	public static int compterValeur(char x, char[] vect)
	{
		int nbFois = 0;

		for (int i = 0; i < vect.length; i++)
		{
			if (vect[i] == x)
			{
				nbFois++;
			}
		}

		return nbFois;
	}

	
