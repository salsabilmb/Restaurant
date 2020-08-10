import java.util.ArrayList;

import java.util.Scanner;

public class main {

	private static Scanner f;

	public static void main(String[] args) {
		int cpt1=0,cpt2=0,x1,x2;
		double x3;
		//Table s1,s2;
	ArrayList <Client> clie = null;
	System.out.println("** Bienvenu sur notre system de Restaurant **");
	int i = 0;
	System.out.println("Donner le nom de retaurant");
	Scanner sc=new Scanner(System.in);
	String nr=sc.nextLine();
	Restaurant r=new Restaurant();
	r.nom=nr;
	Scanner input= new Scanner(System.in);
	System.out.println("Donner le nombre des table pour la zone fumeur");
	int tF=input.nextInt();
	r.nb_tableF=tF;
	System.out.println("Donner le nombre des table pour la zone non fumeur");
	int tNF=input.nextInt();
	r.nb_tableNF=tNF;
	System.out.println("Donner le nombre de chaise pour chaque table");
	int ch=input.nextInt();
	Table s1 = new Table(tF, (tF*ch), true);
	s1.nbr_chaises=(tF*ch);
	r.nbchF=(tF*ch);
    Table s2=new Table(tNF, tNF*ch, false);
    s2.nbr_chaises=tNF*ch;
    r.nbchNF=tNF*ch;
	System.out.println("Taper -1- si un client arriver ");
	System.out.println("Taper -2- si groupe des  clients arriver ");
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	ArrayList<Client> clients = null;
    ArrayList <Groupe> groupe = null;
	if(t==1)
	{
		
		Client c = null;
		System.out.println("si ce client est fumeur entrer 1 si non entrer 2");
		f = new Scanner(System.in);
		int u=f.nextInt();
		if(u==1)
			c=new Client(true);
		else
		{
			if(u==2)
			{   
				c=new Client(false);
			}
		}	
		clie.add(c);
	}
	else
	{
		if(t==2)
		{
			Client c1;
			clients = new ArrayList<Client>();
			System.out.println("donner le nombre de personne de groupe ");
			int pg=input.nextInt();
			for(int j=0;j<pg;j++) {
				System.out.println(" est ce que le client femuers ou non ! : "+(j+1));
				boolean a = input.nextBoolean();
				c1=new Client(a);
				clie.add(c1);
			}
			System.out.println(" est ce que le groupe des femuers ou non ! : "+(i+1));
			boolean a= input.nextBoolean();
			Groupe g = new Groupe(a, pg, clients);
			groupe = new ArrayList<Groupe>();
			groupe.add(g);
			
			for (Groupe group : groupe) {
				if (group.is_smocker==true)
					{	
					cpt1++;
					x1=tF-(group.nbr_client);
					tF=x1;
					x2=s1.getnbrtables()-(((group.nbr_client)*cpt1)/(s1.nbr_chaises/s1.getnbrtables()));
					x3=r.calculerTauxF(group.nbr_client*cpt1,r.nbchF);
					System.out.println("||------------------------zone femeurs------------------------------||");
					System.out.println("||nombre des groupes  dans zone des femuers sont     ==>{{"+cpt1+" groupe}}||");
					System.out.println("||nombre des clients  dans cette zone sont           ==>{{"+(group.nbr_client*cpt1)+"clients}}||");
					System.out.println("||nombre des tables  libre dans cette zone sont      ==>{{"+x2+"table}}  ||");
					System.out.println("||nombre des chaises  libre dans cette zone sont     ==>{{"+x1+"chaire}}||");
					//System.out.println("||le taux d'occupation pour la zone fumeur           ==>{{"+x3+"%}}||");
					System.out.println("||------------------------------------------------------------------||\n");
					}
				if(group.is_smocker==false) {
					
					cpt2++;
					x1=tNF-(group.nbr_client);
					tNF=x1;
					x2=s2.getnbrtables()-(((group.nbr_client)*cpt2)/(s2.nbr_chaises/s2.getnbrtables()));
					x3=r.calculerTauxF(group.nbr_client*cpt2,r.nbchNF);
					System.out.println("||------------------------zone non_femeur---------------------------||");
					System.out.println("||nombre des groupes  dans zone des non_femuers sont ==>{{"+cpt2+" groupe}}||");
					System.out.println("||nombre des clients  dans cette zone sont           ==>{{"+(group.nbr_client*cpt2)+"clients}}||");
					System.out.println("||nombre des tables  libre dans cette zone sont      ==>{{"+x2+"table}}  ||");
					System.out.println("||nombre des chairex  libre dans cette zone sont     ==>{{"+x1+"chaire}}||");
					//System.out.println("||le taux d'occupation pour la zone non_fumeur           ==>{{"+x3+"%}}||");
					System.out.println("||------------------------------------------------------------------||");
				}
			}
			
		}
	}

    


	}

	/*private static Client Client(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}*/

	

}
