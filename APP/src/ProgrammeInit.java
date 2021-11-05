
public class ProgrammeInit {
	private int type = 1;
	
	 final int VILLE = 1;
	 final int CAMPAGNE = 2;
	
	public ProgrammeInit(String type) {
		if (type == "ville") {
			this.setType(VILLE);
		}else if (type == "campagne") {
			this.setType(CAMPAGNE);
		}
		System.out.println("Le terrain à étais créer !");
	}
	public String getType() {
		String a = "";
		if (this.type == VILLE) {
			 a = "ville";
		}else if (this.type == CAMPAGNE) {
			 a = "campagne";
		}
		return a;
	}
	public int setType(int type) {
		return this.type = type;
	}

	public static void main(String[] args) {
		
	}

}
