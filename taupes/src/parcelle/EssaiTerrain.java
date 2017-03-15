package parcelle;

import terrain.Terrain;

public class EssaiTerrain {

	public static void main(String[] args) {
		
		Terrain terrain = new Terrain(20);
		terrain.poserTaupe(5,5,new Taupe(2,null,5,5));
		terrain.creuserTrou(5,6,1);
		terrain.poserTas(6, 6);

	}
	
	

}
