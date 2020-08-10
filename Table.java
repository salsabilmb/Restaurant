
public class Table {

	int nbr_table;
	int nbr_chaises;
	boolean zone;
	
	
	public Table(int a1, int nbr_chaises2, boolean zone2) {
		this.nbr_table=a1;
		this.nbr_chaises=nbr_chaises2;
		this.zone=zone2;
		
	}

	/*public int getnbrchaises() {
		return  nbr_chaises;
	}*/
	public int getnbrtables() {
		return  nbr_table;
	}
}
