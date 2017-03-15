package terrain;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import parcelle.Mur;
import parcelle.Parcelle;
import parcelle.Taupe;

public class Terrain extends JPanel{
	private static Parcelle[][] terrain;
	private static Map<String,ImageIcon> images= new HashMap<>();
	private static final int tailleParcelle=new ImageIcon("images/terre.jpg").getIconHeight()+2;
	private static int tailleTerrain;
	public Terrain(int taille) {
		Terrain.tailleTerrain=taille;
		terrain=new Parcelle[tailleTerrain][tailleTerrain];
		images.put("terre",new ImageIcon("images/terre.jpg"));
		images.put("mur",new ImageIcon("images/mur.jpg"));
		images.put("tas",new ImageIcon("images/tas.jpg"));
		images.put("trou",new ImageIcon("images/trou.jpg"));
		images.put("taupe1",new ImageIcon("images/taupe1.jpg"));
		images.put("taupe2",new ImageIcon("images/taupe2.jpg"));
		Frame f = new Frame("Terrain");
		f.setBounds(100,100, tailleParcelle*tailleTerrain+20, tailleParcelle*tailleTerrain+50);
		f.add(this);
		for (int i=0; i<tailleTerrain-1;i++) {
			terrain[i][0]=new Mur(i,0);terrain[0][i]=new Mur(0,i);
			terrain[i][tailleTerrain-1]=new Mur(i,tailleTerrain-1);
			terrain[tailleTerrain-1][i]=new Mur(tailleTerrain-1,i);
			for (int j=1;j<tailleTerrain-1;j++) terrain[i][j]=new Parcelle(i,j);
		}
		
		terrain[tailleTerrain-1][tailleTerrain-1]=new Mur(tailleTerrain-1,tailleTerrain-1);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		f.setVisible(true);
	}
	public void update(Graphics g) { paint(g); }
	
	public void poserTaupe(int x,int y,Taupe t){
		this.terrain[x][y].poserTaupe(t);
	}

	public boolean estMur(int x,int y){
		return this.terrain[x][y].estMur();
	}

	public int  estTrou(int x,int y){
		return this.terrain[x][y].estTrou();
	}

	public boolean estTas(int x,int y){
		return this.terrain[x][y].estTas();
	} 

	public int estTaupe(int x,int y){
		return this.terrain[x][y].estTaupe();
	}
	
	public void creuserTrou(int x,int y,int equipe){
		this.terrain[x][y].setTrou(equipe);
	}
	
	public void setLibre(int x,int y){
		this.terrain[x][y].vider();
	}
	public void poserTas(int x,int y){
		this.terrain[x][y].poserTas();
	}
	

	public static Parcelle[][] getTerrain() {
		return terrain;
	}
	public static Map<String, ImageIcon> getImages() {
		return images;
	}
	public static int getTailleparcelle() {
		return tailleParcelle;
	}
	public static int getTailleTerrain() {
		return tailleTerrain;
	}
	public void paint(Graphics g) {
		for (int x=0; x<tailleTerrain; x++){
			for (int y=0; y<tailleTerrain; y++){
				if (estMur(x,y)) {
					g.drawImage(images.get("mur").getImage(),x*tailleParcelle,y*tailleParcelle,null);
				}
				else {
					if(estTrou(x,y)!=0){
						g.drawImage(images.get("trou").getImage(),x*tailleParcelle,y*tailleParcelle,null);
					}
					else if (estTas(x,y)) {
						g.drawImage(images.get("tas").getImage(),x*tailleParcelle,y*tailleParcelle,null);
					}
					else{
						switch (estTaupe(x,y))
						{
						case 0:{
							g.drawImage(images.get("terre").getImage(),x*tailleParcelle,y*tailleParcelle,null);
							break;}
						case 1: {
							g.drawImage(images.get("taupe1").getImage(),x*tailleParcelle,y*tailleParcelle,null);
							break;}
						case 2: {
							g.drawImage(images.get("taupe2").getImage(),x*tailleParcelle,y*tailleParcelle,null);
							break;}
						}
					}}}}}}