/**
 * Exercices 2:  Méthodes et Vecteurs
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
	 

	
