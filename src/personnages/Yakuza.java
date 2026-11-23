package personnages;



public class Yakuza extends Humain {
	private int reputation=0;
	private String clan;
	
	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan = clan;
	}
	
	
	
	// Méthode 
	
	public int getReputation() {
		return reputation;
	}



	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int sommeVolee = victime.seFaireExtorquer();
		gagnerArgent(sommeVolee);
		reputation++;
		parler("J’ai piqué les " + sommeVolee + " sous de " + victime.getNom() + ", ce qui me fait " + getQuantiteArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	public int perdre(){
		int argentPerdu = getQuantiteArgent();
		perdreArgent(argentPerdu);
		reputation--;
		parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan " + clan);
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + " Je l'ai dépouillé de ses " +  gain + " sous.");
	}
}
