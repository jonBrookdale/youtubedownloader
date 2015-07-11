import javax.swing.JFrame;
import javax.swing.UIManager;

public class YoutubeDownloader {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			
		}
		
		JFrame mainWindow = new JFrame("Youtube Downloader");
		int windowWidth = 400;           // Window width in pixels
		int windowHeight = 150;          // Window height in pixels
		mainWindow.setBounds(50, 100, windowWidth, windowHeight);  // set position and size
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);        // Display the window
	}
}