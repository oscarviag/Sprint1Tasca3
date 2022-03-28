package n1exercici7;

import java.util.Comparator;

public class Comparador implements Comparator<MapAmbHashCode>{
	  
		@Override
	    public int compare(MapAmbHashCode parell1, MapAmbHashCode parell2)
	    {			
	        return parell1.hashcode.compareTo(parell2.hashcode);
	    }

}
