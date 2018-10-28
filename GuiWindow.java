import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class GuiWindow extends JFrame {

	public GuiWindow() {
		super();
		build();
	}

	private void build() {
		setTitle("World of Constellations");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension prefSize = new Dimension(screenSize.width/2+200,screenSize.height);

		setPreferredSize(prefSize);
        setMinimumSize(prefSize);
        pack();

		setContentPane(buildContentPane());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private JPanel buildContentPane() {
		JPanel panel = new JPanel();
		panel.setLayout(null);

		setLocationRelativeTo(null);

        addComponentsToPane(panel); 

        ImagePanel img = new ImagePanel(new ImageIcon("img/start.jpg").getImage());
		panel.add(img);

		return panel;
	}

	class ImagePanel extends JPanel {

  	private Image img;

	public ImagePanel(String img) {
		this(new ImageIcon(img).getImage());
	}

	public ImagePanel(Image img) {
		this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}

public static void addComponentsToPane(Container pane) { 
    pane.setLayout(null); 
 
	String text = "Welcome to the World of Сonstellations !" + "<br>" + "Let’s go to discover different Constellations !";
	JLabel label = new JLabel("<html><div style='text-align: center; font-size: 30px; color: #ADE6F7;'>" + text + "</div></html>", JLabel.CENTER);

    JButton b1 = new JButton("<html><div style='font-size: 30px;'>" +"START" + "</div></html>");
    b1.setFocusPainted(false);
 
	pane.add(label);
    pane.add(b1);
 
    Insets insets = pane.getInsets(); 
    Dimension size;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    size = label.getPreferredSize(); 
    label.setBounds(120, insets.top, 
                    screenSize.width/2, screenSize.width/2); 

    size = b1.getPreferredSize(); 
    b1.setBounds(500 + insets.left, 800 + insets.top, 
                 200, 100); 
    } 