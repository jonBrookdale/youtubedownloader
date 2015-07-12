package ytd;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class YoutubeDownloader {
	static final Logger logger = LogManager.getLogger(YoutubeDownloader.class.getName());
	
	public static void main(String[] args) {
		logger.trace("Hello World");
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			logger.error("This system is not supported");
		}

		JFrame mainWindow = new JFrame("Youtube Downloader");
		int windowWidth = 400;           // Window width in pixels
		int windowHeight = 150;          // Window height in pixels
		mainWindow.setBounds(50, 100, windowWidth, windowHeight);  // set position and size
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);        // Display the window
	}
}