import java.io.File;

class Hemisphere {
	protected String type;
	
	public Hemisphere(String t) {
		type = t;
	}

	public Hemisphere() {}


	public void showConstList() {
		File myFolder = new File("assets/"+type);
		File[] files = myFolder.listFiles();
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}

	public String getType() { return type; }
	public void setType(String s) { type = s; }

}
