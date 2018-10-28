import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Constellation extends Hemisphere {
	protected String name;

	public Constellation(String t, String n) {
		super(t);
		name = n;
	}

	public Constellation() {}

	public void openFile() throws Exception {
			FileReader reader = new FileReader("assets/"+type+"/"+name);
			BufferedReader in = new BufferedReader(reader);
				String line = in.readLine();
				while(line != null) {
					System.out.println(line);
					line = in.readLine();
				}			
		
	}

	public String getName() { return name; }
	public void setName(String n) { name = n; }
}
