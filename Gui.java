import javax.swing.SwingUtilities;

public class Gui {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				GuiWindow window = new GuiWindow();
				window.setVisible(true);
			}
		});
	}
}