public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private Boolean mordu;
	private int vie;
	private String[] tabtype;
	public Personne (String _nom, String _prenom, int _age) {
		this.nom = setNom(_nom);
		this.prenom = setPrenom(_prenom);
		this.age = setAge(_age);
		this.vie = setVie(20);
		this.mordu = false;
		System.out.print("Le personnage "+this.getPrenom()+" "+this.getNom()+" à étais créer !\n");
	}
	public int getVie() {
		return this.vie;
	}
	public int setVie(int val) {
		return this.vie = val;
	}
	public String getNom() {
		return this.nom;
	}
	public String setNom(String nom) {
		return this.nom = nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public String setPrenom(String prenom) {
		return this.prenom = prenom;
	}
	public int getAge() {
		return this.age;
	}
	public int setAge(int age) {
		return this.age = age;
	}
	public void afficher () {
		System.out.print(this.getNom()+" "+this.getPrenom()+" "+this.getAge()+"\n");
	}
	public void mordu() {
		int cpt = 4;
		this.mordu = true;
		System.out.print(this.prenom+" "+this.nom+" à étais mordu par un rodeur !\n");
		while (cpt != 0) {
			System.out.print(this.prenom+" "+this.nom+ " meurs à cause de la morsure de rodeur !\n");
			cpt--;
		}
		if (cpt == 0) {
			System.out.print(this.prenom+" "+this.nom+ " viens de se transformé en rodeur !");
			
		}
		
	}
	
	public void attaqueP(Personne perso) {
			System.out.print(this.getPrenom()+" à attaqué le personnage : "+perso.getNom());
			perso.vie = getVie()-2;
			
		}
	public static void main(String[] args) {
		Personne P3 = new Personne("Grimes", "Carl", 16);
		
		
	}

}
