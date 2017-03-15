package parcelle;

import terrain.Coordonnees;
import terrain.Terrain;
import terrain.Vue;

public class EssaiTerrain {

	public static void main(String[] args) {
		
		
		Terrain terrain = new Terrain(20);
		Vue j1= new Vue(terrain);
		Vue j2= new Vue(terrain);
		
		Taupe taupe1=new Taupe(1,j1,5,5);
		Taupe taupe2=new Taupe(2,j2,8,8);
		j1.poserTaupe(taupe1, taupe1.getCordonnees());
		j2.poserTaupe(taupe2, taupe2.getCordonnees());
		j1.poserTas(new Coordonnees(5,6));
		j2.poserTas(new Coordonnees(8,9));
		j2.creuserTrou(taupe2, new Coordonnees(8,7));
		//j1.terrain.poserTaupe(x, y, t);
		//terrain.poserTas(6, 6);

	}
	
	

}
