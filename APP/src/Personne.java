public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private Boolean mordu;
	private String[] tabtype;
	public Personne (String _nom, String _prenom, int _age) {
		this.nom = setNom(_nom);
		this.prenom = setPrenom(_prenom);
		this.age = setAge(_age);
		this.mordu = false;
		System.out.print("Le personnage "+this.getPrenom()+" "+this.getNom()+" à étais créer !\n");
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
		this.mordu = true;
		System.out.print(this.prenom+" "+this.nom+" à étais mordu par un rodeur !");
	}
	public static void main(String[] args) {
		Personne P3 = new Personne("Grimes", "Carl", 16);
	}

}
