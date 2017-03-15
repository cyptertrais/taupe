package terrain;

import parcelle.Taupe;

public class Vue {
	Terrain terrain;
	public Vue(Terrain t){
		this.terrain=t;	
	}

	public boolean estTas(Coordonnees c){
		return this.terrain.estTas(c.getX(), c.getY());
	}
	public void poserTas(Coordonnees c){
		terrain.poserTas(c.getX(), c.getY());
	}

	public boolean estTerrain(Coordonnees c){
		return c.abscisse<=terrain.getTailleTerrain() && c.ordonnee<=terrain.getTailleTerrain();
	}
	public void creuserTrou(Taupe t,Coordonnees c){
		terrain.creuserTrou(c.getX(), c.getY(), t.getEquipe());

	}
	
	public boolean setLibre(Coordonnees c){
		terrain.setLibre(c.getX(), c.getY());
		return true;
	}
	
	public void poserTaupe(Taupe taupe,
            Coordonnees c){
		terrain.poserTaupe(c.getX(), c.getY(), taupe);
	}

	
	

}
