import javax.swing.*;
import java.io.*;

public class FichierCaractereInputOutput
{
	private static boolean copierFichier(String paramNomSource,
									  String paramNomCible)
	{
		int caractereLu = 0;
		boolean copieOk = true;

		try
		{
			FileReader fluxSource = new FileReader(paramNomSource);
			FileWriter fluxCible = new FileWriter(paramNomCible);
		
			try
			{
				caractereLu = fluxSource.read();

				while(caractereLu != -1)
				{
					fluxCible.write(caractereLu);
					caractereLu = fluxSource.read();
				}
			}
			catch(IOException e)
			{
				JOptionPane.showMessageDialog(null,
										 "Erreur lors de la copie du fichier",
										 "Erreur E/S", JOptionPane.ERROR_MESSAGE);
				copieOk = false;
			}
			
			fluxSource.close(); 
			fluxCible.close();
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null,
									"Erreur lors de l'ouverture",
									"Erreur E/S",
									JOptionPane.ERROR_MESSAGE);
			copieOk = false;
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null,
									 "Erreur lors de la fermeture",
									 "Erreur E/S",
									 JOptionPane.ERROR_MESSAGE);
			copieOk = false;
		}
		
		return copieOk;
	}
			
	public static void main(String arguments[])
	{
		String source = "index.html";
		String cible = "index_old.html";

		if(FichierCaractereInputOutput.copierFichier(source, cible))
		{
			JOptionPane.showMessageDialog(null,
							"C'est ok pour la copie du fichier",
							"Information E/S",
							JOptionPane.INFORMATION_MESSAGE );      
		}
		else
		{
			JOptionPane.showMessageDialog(null,
								  	"Il y a eu un probl�me lors de la copie " +
									"du fichier",
								   "Information E/S",
								   JOptionPane.INFORMATION_MESSAGE);
		}
		
		System.exit(0);
	}
}
