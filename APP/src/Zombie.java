public class Zombie {
	private int identifient;
	private int vie = 20;
	private int nbrPersoM;
	private int type = 1;
	
	final int TYPE_NORMAL = 1;
	final int TYPE_RADIATION = 2;
	
	public String getType() {
		String a = "";
		if (this.type == TYPE_NORMAL) {
			 a = "normal";
		}else if (this.type == TYPE_RADIATION) {
			 a = "radioactif";
		}
		return a;
	}
	public int getVie() {
		return this.vie;
	}
	public int setVie(int _vie) {
		return this.vie = _vie;
	}
	public int setType(int type) {
		return this.type = type;
	}
	public int getId() {
		return this.identifient;
	}
	public int setId(int id) {
		return this.identifient = id;
	}
	public Zombie(int id, String type ) {
		this.identifient = this.setId(id);
		if (type == "normal") {
			this.setType(TYPE_NORMAL);
			this.vie = this.setVie(10);
		}else if(type == "radiation") {
			this.setType(TYPE_RADIATION);
			this.vie = this.setVie(20);
		}
		System.out.println("Zombie "+this.getId()+" à étais créer !");

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
		System.out.println(perso.getPrenom()+" "+perso.getNom()+" à étais mordu par le rodeur n°"+this.getId());
		this.nbrPersoM = this.getnbrM()+1;
	}
	public static void main(String[] args) {
	}

}
