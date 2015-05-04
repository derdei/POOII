import javax.swing.*;
import java.io.*;

public class FichierEcritureOctets
{
	



	private static boolean ecrireTableauOctets(byte[] paramTab,
									 	    String paramNomFichier)
	{
		boolean ecritureOk = true;
		
		FileOutputStream fosTemp = null;
		
		try
		{
			fosTemp = new FileOutputStream(paramNomFichier);
			
			try
			{
				for (int i = 0; i < paramTab.length; i++)
				{
					fosTemp.write(paramTab[i]);
				}
			}
			catch(IOException e)
			{
				JOptionPane.showMessageDialog(null,
										 "Erreur lors de l'écriture dans le fichier",
										 "Erreur E/S",
										 JOptionPane.ERROR_MESSAGE);
				ecritureOk = false;
			}
			
			fosTemp.close();
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null,
									"Erreur lors de l'ouverture",
									"Erreur E/S",
									JOptionPane.ERROR_MESSAGE);
			ecritureOk = false;
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null,
									"Erreur lors de la fermeture",
									"Erreur E/S",
									JOptionPane.ERROR_MESSAGE);
			ecritureOk = false;
		}
		
		return ecritureOk;
	}




	public static void main(String[] args)
	{		
		byte[] tabOctets = {34, 56, 4, 7, 8, 108, 5, 45, 14, 124};
		String nomFichier = "FichierOctet.bin";
		
		if (FichierEcritureOctets.ecrireTableauOctets(tabOctets, nomFichier))
		{
			JOptionPane.showMessageDialog(null,
								  "C'est ok pour l'écriture dans le fichier",
								  "Information E/S",
								  JOptionPane.INFORMATION_MESSAGE );
		}
		else
		{
			JOptionPane.showMessageDialog(null,
								"Il y a eu un problème lors de l'écriture dans "+
								"le fichier",
								"Information E/S",
								JOptionPane.INFORMATION_MESSAGE );
		}
		
		System.exit(0);
	}
}
