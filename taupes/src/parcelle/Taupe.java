package parcelle;
import terrain.Vue;
import terrain.Coordonnees;
public class Taupe {

	private int equipe;
	private Coordonnees cord;
	private Vue vue;
	
	public Taupe(int equipe,Vue v){
		this.equipe=equipe;this.vue=v;
	}
	public Taupe(int equipe,Vue v,int x ,int y){
		this(equipe,v);
		this.cord=new Coordonnees(x,y);
	}
	public int getEquipe() {
		return equipe;
	}
	public Coordonnees getCordonnees() {
		return cord;
	}
	public Vue getVue() {
		return vue;
	}
	public void setCoord(Coordonnees c){
		this.cord.modifier(c);
	}
	
	
	
}
