import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javazoom.jlgui.basicplayer.BasicPlayer;



public class Reproductor{
	public static void main(String[] args){
		
		Musica("C:\\Users\\jjmza\\Desktop\\Shakira - Waka Waka (This Time for Africa) (The Official 2010 FIFA World Cup Song.mp3)");
		
		
	}
	public static void Musica(String path){
		BasicPlayer player = new BasicPlayer();
		try {
		  Reproductor mi_reproductor = new Reproductor();
		  player.open(new File(path));
		  player.play();
		  
		} catch (Exception ex) {
			
		  System.out.println("Error: " + ex.getMessage());
		  
		}
	}
}
