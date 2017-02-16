package tp4;

import java.time.*;
public class Evenement {
	private String intitule;
	private String lieu;
	private LocalDate debut;
	private LocalDate fin;
	
	public Evenement(String i,String lieu, LocalDate deb,LocalDate fin){
	this.intitule=i;this.lieu=lieu;
	if(fin.isBefore(deb)){this.debut=deb;this.fin=deb;}else{
	this.debut=deb;this.fin=fin;
	}
	}
	
	public String toString(){
		return intitule+" à "+ lieu +" :de "+ getDebut()+" à "+ fin ;
	}
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	boolean equals(Evenement e){
		return this.debut==e.debut && this.fin==e.fin && this.intitule==e.intitule && this.lieu==e.lieu; 
	}
	
	boolean chevauche(Evenement e){
	if(this.fin.isBefore(e.debut) || this.debut.isAfter(e.fin) ){return false;}	
	return true;	
	}
}
