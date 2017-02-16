package tp4;
import java.time.*;
public class EssaiAgenda {

	public static void main(String[] args) {
		Agenda agenda= new Agenda();
		Evenement e1= new Evenement("Docteur","Paris",LocalDate.of(2017, 02, 19),LocalDate.of(2017, 03, 27));
		Evenement e2= new Evenement("Donner une piece a Alexis","IUT",LocalDate.of(2017, 02, 16),LocalDate.of(2017, 02, 17));
		agenda.entrerEvenement(e1);
		agenda.entrable(e2);
		System.out.println(e1.chevauche(e2));
	}

}
