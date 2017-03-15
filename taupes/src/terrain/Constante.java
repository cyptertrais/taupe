package terrain;
import java.util.List;
import java.util.ArrayList;
public class Constante {
private final  Coordonnees HAUT= new Coordonnees(0,-1);
private final Coordonnees BAS=new Coordonnees(0,1);
private final Coordonnees DROITE= new Coordonnees(1,0);
private final Coordonnees GAUCHE= new Coordonnees(-1,0);
List <Coordonnees> dep;
public Constante(){
this.dep=new ArrayList<Coordonnees>();	
}
}
