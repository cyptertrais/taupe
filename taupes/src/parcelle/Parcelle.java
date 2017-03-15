package parcelle;
import terrain.Coordonnees;
public class Parcelle {

int trou;
boolean mur;
boolean tas;
Coordonnees cord;
Taupe taupe;

public Parcelle(int x,int y){
this.cord= new Coordonnees(x,y);	
}

public Coordonnees getCoordonnees(){
	return this.cord;
}

public void setCoordonnees(Coordonnees c){
	this.cord.modifier(c);
}

public int  estTrou(){
	return this.trou;
}

public void setTrou(int x){
	this.trou=x;
}

public boolean estMur(){
	return this.mur;
}

public boolean estTas(){
	return this.tas;
}

public int estTaupe(){
	if(this.taupe==null)return 0;
	return this.taupe.getEquipe();
}

public void setMur(){
	this.mur=true;
}

public Taupe getTaupe(){
	return this.taupe;
}
public void poserTaupe(Taupe t){
	this.taupe=t;
}
public void retirertaupe(){
	this.taupe=null;
}
public void bouchertrou(){
	this.trou=0;
}

public void creuserTrou(){
	this.trou=this.taupe.getEquipe();
}

public void vider(){
	trou=0;this.mur=false;this.tas=false;this.taupe=null;
}
public void poserTas(){
	this.tas=true;
}
public void enlevertas(){
	this.tas=false;
}
	
}
