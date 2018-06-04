import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Continent {

	ArrayList<Region> listregion = new ArrayList<>();

	public String getcontinent() throws IOException { // chercher valeurs dans fichier text

		BufferedReader reader = new BufferedReader(new FileReader("./src/couleur_regions.txt"));
		String line;

		while ((line = reader.readLine()) != null) {
			String values[] = line.split(" ");
			Region r = new Region(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]), values[3]);
		/*	System.out.println(r.r + " " + r.g + " " + r.b); */
			listregion.add(r);
		} 

		return line;

	}

}
