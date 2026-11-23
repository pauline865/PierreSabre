package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	public Ronin(String nom , String boissonFavorite, int quantiteArgent) {
		super(nom,boissonFavorite,quantiteArgent);
	}
	
	// Méthode 
	
	public void donner(Commercant beneficiaire) {
		int don = getQuantiteArgent()*10/100;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		if (force >= adversaire.getReputation() ) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			int gain = adversaire.getQuantiteArgent();
			adversaire.perdre();
			honneur++;
			gagnerArgent(gain);
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getQuantiteArgent());
			honneur--;
			perdreArgent(getQuantiteArgent());
		}
	}
}