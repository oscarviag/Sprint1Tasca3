package n1exercici2;

import java.util.ArrayList;
import java.util.HashSet;

public class Execucio {

	public static void main(String[] args) {
		
		ArrayList<Month> mesos = new ArrayList<Month>();
		
		Month gener = new Month("Gener");
		mesos.add(gener);
		
		Month febrer = new Month("Febrer");
		mesos.add(febrer);
		
		Month marc = new Month("Març");
		mesos.add(marc);
		
		Month abril = new Month("Abril");
		mesos.add(abril);
		
		Month maig = new Month("Maig");
		mesos.add(maig);
		
		Month juny = new Month("Juny");
		mesos.add(juny);
		
		Month juliol = new Month("Juliol");
		mesos.add(juliol);
		
		Month setembre = new Month("Setembre");
		mesos.add(setembre);
		
		Month octubre = new Month("Octubre");
		mesos.add(octubre);
		
		Month novembre = new Month("Novembre");
		mesos.add(novembre);
		
		Month desembre = new Month("Desembre");
		mesos.add(desembre);
			
		Month agost = new Month("Agost");
		mesos.add(7,agost);
		
		HashSet<Month> hashset= new HashSet<>(mesos);
		
		for (Month element : hashset) {
            System.out.println(element.name);
        }
		
		Month prova = new Month("Prova");
		hashset.add(prova); // Inserim un nou valor com a control
		
		hashset.add(agost); // Intentem inserir un valor repetit
		
		System.out.println();
		
		for (Month element : hashset) {
            System.out.println(element.name);
        }
		
	}

}
