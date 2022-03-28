package n1exercici8;

import java.util.Comparator;

public class Comparador implements Comparator<ParellsExtrets>{
	  
		@Override
	    public int compare(ParellsExtrets parell1, ParellsExtrets parell2)
	    {			
	        return parell1.llistaKeys.compareTo(parell2.llistaKeys);
	    }

}
