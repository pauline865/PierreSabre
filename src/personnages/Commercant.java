package personnages;

public class Commercant extends Humain {
	
	//constructeur
	public Commercant(String nom,int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
	}
	
	// Méthode 
	
	public int seFaireExtorquer() {
		int sommeExtorquer = getQuantiteArgent();
		perdreArgent(sommeExtorquer);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return sommeExtorquer;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}

}
