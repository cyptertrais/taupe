package terrain;

public class Coordonnees {
int abscisse;
int ordonnee;
public Coordonnees(int x,int y){
	this.abscisse=x;this.ordonnee=y;
}
public int getX() {
	return this.abscisse;
}
public int getY() {
	return this.ordonnee;
}

public Coordonnees modifier(Coordonnees c){
return new Coordonnees(this.abscisse+c.abscisse,this.ordonnee+c.ordonnee);	
}
}
