/**
 * Exercices :  Méthodes et Matrices
 * 
 * Pour chacun des problèmes suivants :
 * 
 * 1. Identifier les entrées/sorties de la méthode en dessinant la boîte noire.
 * 
 * 2. Écrire l'algorithme de la méthode.
 * 
 * 3. Coder la méthode en Java.
 */
public class Exercices
{

	/**
	 * 1. Écrire une méthode qui place des 1 sur la première ligne d'une
	 * matrice, des 2 sur la deuxième, des 3 sur la troisième, etc…
	 * 
	 * <pre>
	 *                          ----------------------
	 *                         |                      |
	 *               mat --->  |     placerMat123     |---> mat
	 *                         |                      |
	 *                          ----------------------
	 *   	
	

	/**
	 * 2. Écrire une méthode qui retourne une matrice de n lignes et n colonnes
	 * où il y aura des 1 sur la première ligne, des 2 sur la deuxième, etc…
	 * 
	 * <pre>
	 *                          ----------------------
	 *                         |                      |
	 *                 n --->  |   genererMat123      |---> mat
	 *                         |                      |
	 *                          ----------------------
	 * 

	/**************************************************************************
	 * 3. Écrire une méthode qui retourne la somme des éléments d'une matrice.
	 * 
	 * <pre>
	 *                          ----------------------
	 *                         |                      |
	 *               mat --->  |    calculerSomme     |---> somme
	 *                         |                      |
	 *                          ----------------------
	

	/**
	 * 4. Écrire une méthode , qui retourne vrai si les éléments d'un vecteur
	 * sont égaux, valeur pour valeur, aux éléments d'une des lignes d'une
	 * matrice et faux sinon. Si le vecteur n'a pas le même nombre d'éléments
	 * qu'une ligne de la matrice, retourner faux.
	 * 
	 * <pre>
	 *                          ----------------------
	 *                         |                      |
	 *              vect --->  |   chercherVecteur    |---> vrai ou faux
	 *              mat --->   |                      |
	 *                          ----------------------
	

	

	/**
	 * 5. Écrire une méthode qui retourne vrai si une matrice est carrée et faux
	 * sinon. Une matrice est carrée si elle a le même nombre de lignes et de
	 * colonnes.
	 * 
	 * <pre>
	 * 							----------------------
	 *                         |                      |
	 *               mat --->  |    verifierCarree    |---> vrai ou faux
	 *                         |                      |
	 *                          ----------------------
	

	/**
	 * 6. Écrire une méthode qui retourne une matrice identité de dimension n.
	 * Une matrice identité est une matrice carrée où il y a des 1 sur la
	 * diagonale principale et des 0 partout ailleurs.
	 * 
	 * <pre>
	 * 						    ----------------------
	 *                         |                      |
	 *                 n --->  |   genererIdentite    |---> mat
	 *                         |                      |
	 *                          ----------------------
	

	/**
	 * 7. Écrire une méthode qui retourne vrai si toutes les lignes d'une
	 * matrice sont identiques et faux sinon.
	 * 
	 * <pre>
	 * 			    -------------------------
	 *                         |                         |
	 *                mat ---> |verifierLignesIdentiques |---> vrai ou faux
	 *                         |                         |
	 *                          -------------------------
	 

	/**
	 * 8. Écrire une méthode qui retourne vrai si les éléments des coins d'une
	 * matrice sont tous égaux et faux sinon.
	 * 
	 * <pre>
	 * 		 	    -----------------------
	 *                         |                       |
	 *               mat --->  |verifierCoinsIdentiques|---> vrai ou faux
	 *                         |                       |
	 *                          -----------------------
	

	/**
	 * 9. Écrire une méthode qui remplacera toutes les valeurs supérieures à 10
	 * dans une matrice par la valeur 10.
	 * 
	 * <pre>
	 * 			   ----------------------
	 *                         |                      |
	 *               mat --->  |    maximiserA10      |---> mat
	 *                         |                      |
	 *                          ----------------------
	
	/**
	 * 10. Écrire une méthode, qui retourne vrai si les éléments d'une des
	 * diagonales d'une matrice carrée sont tous égaux entre eux et faux sinon.
	 * Si la matrice n'est pas carrée, retourner faux
	 * 
	 * <pre>
	 * 			   ----------------------
	 *                         |                      |
	 *               mat --->  | verifierUneDiagonale |---> vrai ou faux
	 *                         |                      |
	 *                          ----------------------
	 

	/**
	 * 11. Écrire une méthode qui retourne vrai si les éléments des diagonales
	 * d'une matrice carrée sont égaux valeur pour valeur pour une même ligne et
	 * faux sinon. Si la matrice n'est pas carre, retourner faux.  
	 * 
	 * <pre>
	 * 			   --------------------------
	 *                         |                          |
	 *               mat --->  | verifierLignesDiagonales |---> vrai ou faux
	 *                         |                          |
	 *                          --------------------------
	 

	/**
	 * 12. Écrire une méthode qui retourne un vecteur des sommes des lignes
	 * d'une matrice.
	 * 
	 * <pre>
	 * 			   ----------------------
	 *                         |                      |
	 *               mat --->  |     sommerLignes     |---> vect
	 *                         |                      |
	 *                          ----------------------
	

	/**
	 * 13. Écrire une méthode qui retourne une matrice où on aura enlevé la
	 * première ligne et la dernière colonne d'une matrice fournie en entrée.
	 * 
	 * <pre>
	 * 			    ----------------------
	 *                         |                      |
	 *              mat1 --->  |     reduireMat       |---> mat2
	 *                         |                      |
	 *                          ----------------------
	

	/**
	 * 14. Écrire une méthode qui retournera une matrice où on aura ajouté une
	 * colonne à une matrice fournie en entrée. Cette colonne contiendra les
	 * sommes de chacune des lignes.
	 * 
	 * <pre>
	 * 							----------------------
	 *                         |                      |
	 *              mat1 --->  |  ajouterColonneSomme |---> mat2
	 *                         |                      |
	 *                          ----------------------
	

	/**
	 * 15. Écrire une méthode qui retourne la somme des valeurs qui ne font pas
	 * partie des diagonales d'une matrice carrée. Si la matrice n'est pas
	 * carrée, retourner 0.
	 * 
	 * <pre>
	 * 			   ---------------------------
	 *                         |                           |
	 *               mat --->  |calculerSommeHorsDiagonales|---> somme
	 *                         |                           |
	 *                          ---------------------------
	

	/**
	 * 16. Écrire une méthode qui retourne une matrice des valeurs maximales et
	 * des indices de colonne de ces valeurs pour chacune des lignes d'une
	 * matrice.
	 * 
	 * <pre>
	 * 			   ----------------------
	 *                         |                      |
	 *              mat1 --->  |   trouverMatMaximum  |---> mat2
	 *                         |                      |
	 *                          ----------------------
	

	/**
	 * Point d'entré pour l'ensemble.
	 * 
	 * @param arg
	 */
	public static void main(String[] arg)
	{
		int[][] mat1 =
		{
		{ 1, 2, 3 },
		{ 4, 5, 6 },
		{ 7, 8, 9 } };
		int[][] mat2 =
		{
		{ 1, 2, 13, 1 },
		{ 1, 2, 2, 5 },
		{ 1, 5, 5, 51 } };
		int[] vect =
		{ 4, 3, 6 };

		afficherMat(mat2);
		mat1 = trouverMatMaximum(mat2);
		afficherMat(mat1);
		afficherVect(vect);

		System.out.println(calculerSommeHorsDiagonales(mat2));


...........
	}
} // fin de la classe