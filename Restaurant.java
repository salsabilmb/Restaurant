import java.util.ArrayList;

public class Restaurant {
	ArrayList<Table> table=new ArrayList<Table>() ;
	protected 
	String nom;
	public
	int nb_tables;
	int nbchaiseT;
	int nbchF;
	int nbchNF;
	int nb_tableF;
	int nb_tableNF;
	/*double tauxoccF;
	double tauxoccNF;
	double tauxoccT;*/
	/* public ajouterTable(boolean zf,int nbt)
	{
		Table t=new Table();
		
	}*/

	public double calculerTauxF(int nb_chaiseoccF ,int chF)
	{
		double tauxoccF;
		return ( tauxoccF=(nb_chaiseoccF*100)/chF);
	}
	
	public double calculerTauxNF(int nb_chaiseoccNF,int chNF)
	{
		double tauxoccNF;
		return tauxoccNF=(nb_chaiseoccNF*100)/chNF;
	}
	public double calculerTauxT(double tauxoccNF,double tauxoccF)
	{
		double tauxoccT;
		return tauxoccT=tauxoccNF+tauxoccF;
	}


}
