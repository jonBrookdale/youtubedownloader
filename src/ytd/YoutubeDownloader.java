package ytd;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class YoutubeDownloader {
	static Logger logger = Logger.getLogger(YoutubeDownloader.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("Hello World");
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			logger.info("This system is not supported");
		}

		JFrame mainWindow = new JFrame("Youtube Downloader");
		int windowWidth = 400;           // Window width in pixels
		int windowHeight = 150;          // Window height in pixels
		mainWindow.setBounds(50, 100, windowWidth, windowHeight);  // set position and size
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);        // Display the window
	}
}