
public class Main {

	public static void main(String[] args) {
		ProgrammeInit PI1 = new ProgrammeInit("ville");
		Personne P3 = new Personne("Grimes", "Carl", 16);
		Personne P1 = new Personne("Grimes", "Rick", 35);
		Zombie Z1 = new Zombie(1, "normal");
		Zombie Z2 = new Zombie(2, "radiation");
		System.out.println("Vous êtes dans une "+PI1.getType());
		System.out.println("le Zombie n° "+Z1.getId()+" est de type : "+Z1.getType()+" avec "+Z1.getVie()+" point de vie");
		P1.attaqueZ(Z1);
		System.out.println(Z1.getVie());
		/*P1.parler();*/
	}

}
