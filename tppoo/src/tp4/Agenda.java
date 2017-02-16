package tp4;
import java.util.ArrayList;
public class Agenda {
	ArrayList<Evenement> cal;

	public Agenda(){
		cal= new ArrayList<Evenement>();
	}



	public String toString() {
		String res="";
		for (Evenement ev : cal) {
			res=res+ev.toString()+"\n";
		}
		return res;
	}

	public boolean entrable (Evenement evenement){
		if(cal.contains(evenement)){return false;}
		else{return true;}

	}
	public void entrerEvenement (Evenement evenement){
		int indice=0;
		if(entrable(evenement)){
			for(Evenement e: cal){
				if(evenement.getDebut().isAfter(e.getDebut())){indice++;}
			}
			cal.add(indice,evenement);}
	}

	void supprimerEvenement (Evenement evenement){
		if(cal.contains(evenement)){
			cal.remove(evenement);

		}
	}

	void supprimerEvenement (int idx){
		if(cal.contains(idx)){
			cal.remove(idx);

		}
	}
	public void entrerEvenement (int idx,Evenement e){
		if(entrable(e)){cal.add(idx,e);}
	}

	public void supprimerChevauchants(Evenement evenement){
		for (int idx=cal.size()-1;idx>=0;idx--) {
			if(cal.get(idx).chevauche(evenement)){supprimerEvenement(idx);}
		}
	}

	void supprimerEntre(Evenement evt1, Evenement evt2){
		Evenement local = new Evenement("","",evt1.getDebut(),evt2.getFin());
		for (int idx=cal.size()-1;idx>=0;idx--) {
			if(cal.get(idx).chevauche(local)){supprimerEvenement(idx);}
		}

	}
	
	


}
