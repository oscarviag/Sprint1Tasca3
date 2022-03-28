package n1exercici3;

public class Generadora {

	static String[] personatges= {"Obi wan Kenobi","Yoda","Darth Vader", "Anakin Skywalker", "Ashoka Tano", "Boba Fett"};
	
	static int index=0;
	
	public static String seguentPersonatge() {
	
		if (index == personatges.length) {
			index=0;
		}
		index++;
		return personatges[index-1];
		
	}
}
