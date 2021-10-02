public class Zombie {
	private int identifient;
	private int nbrPersoM;
	public int getId() {
		return this.identifient;
	}
	public int setId(int id) {
		return this.identifient = id;
	}
	public Zombie(int id) {
		this.identifient = this.setId(id);
		System.out.print("Zombie "+this.getId()+" à étais créer !\n");
	}
	public int getnbrM() {
		return this.nbrPersoM;
	}
	public int setnbrM(int nbr) {
		return this.nbrPersoM = nbr;
	}
	public void gronier() {
		System.out.print("ARRRRRH");
	}
	public void modre(Personne perso) {
		System.out.print(perso.getPrenom()+" "+perso.getNom()+" à étais mordu par le rodeur n°"+this.getId());
		this.nbrPersoM = this.getnbrM()+1;
	}
	public static void main(String[] args) {
		Zombie Z1 = new Zombie(1);
	}

}
