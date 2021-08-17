package fr.theshark34.technicraft.launcher;

import javax.swing.JFrame;

import fr.theshark34.swinger.util.WindowMover;
import fr.theshark34.swinger.Swinger;

@SuppressWarnings("serial")
public class LauncherFrame extends JFrame {

	private static LauncherFrame instance;
	private LauncherPanel launcherPanel;
	
	public LauncherFrame() {
		this.setTitle("Technicraft V6.5 Launcher");
		this.setSize(975, 625);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setIconImage(Swinger.getResource("icon.png"));
		launcherPanel = new LauncherPanel();
		this.setContentPane(launcherPanel = new LauncherPanel());

		WindowMover mover = new WindowMover(this);
		this.addMouseListener(mover);
		this.addMouseMotionListener(mover);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Swinger.setSystemLookNFeel();
		Swinger.setResourcePath("/fr/theshark34/technicraft/launcher/resources/");
		
		instance = new LauncherFrame();
	}
	
	public static LauncherFrame getInstance() {
		return instance;
	}
	
	public LauncherPanel getLauncherPanel() {
		return this.launcherPanel;
	}
	
}
