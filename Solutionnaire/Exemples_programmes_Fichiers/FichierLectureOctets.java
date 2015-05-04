import javax.swing.*;
import java.io.*;

public class FichierLectureOctets
{
	
	private static boolean lectureTableauOctets(byte[] paramTab,
									 	     String paramNomFichier)
	{
		boolean lectureOk = true;
		byte octetLu = 0;
		int compteurOctet = 0;
		
		FileInputStream fisTemp = null;
		
		try
		{
			fisTemp = new FileInputStream(paramNomFichier);
			
			try
			{
				compteurOctet = 0;
				octetLu = (byte) fisTemp.read();
				
				while(octetLu != -1)
				{
					paramTab[compteurOctet++] = octetLu;
					octetLu = (byte) fisTemp.read();
				}
			}
			catch(IOException e)
			{
				JOptionPane.showMessageDialog(null,
										"Erreur lors de la lecture dans le fichier",
										"Erreur E/S",
										JOptionPane.ERROR_MESSAGE);
				lectureOk = false;
			}
			
			fisTemp.close();
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null,
									"Erreur lors de l'ouverture",
									"Erreur E/S",
									JOptionPane.ERROR_MESSAGE);
			lectureOk = false;
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null,
									"Erreur lors de la fermeture",
									"Erreur E/S",
									JOptionPane.ERROR_MESSAGE);
			lectureOk = false;
		}
		
		return lectureOk;
	}
	public static void main(String[] args)
	{		
		byte[] tabOctets = new byte[10];
		String nomFichier = "FichierOctet.bin";
		String tabOctetsString = "";
		
		if (FichierLectureOctets.lectureTableauOctets(tabOctets, nomFichier))
		{
			tabOctetsString = " ";
			for (int i = 0; i < tabOctets.length; i++)
			{
				tabOctetsString += tabOctets[i] + ", ";	
			}
			
			JOptionPane.showMessageDialog(null,
							"C'est ok pour la lecture du fichier" + 
							tabOctetsString,
							"Information E/S",
							JOptionPane.INFORMATION_MESSAGE );      
		}
		else
		{
			JOptionPane.showMessageDialog(null,
									"Il y a eu un problème lors de la lecture " + 
									"du fichier",
									"Information E/S",
									JOptionPane.INFORMATION_MESSAGE);
		}
		
		System.exit(0);
	}
}
