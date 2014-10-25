package frostbooter;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class DaTacoMood extends JFrame {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

   public DaTacoMood() {
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setTitle("taco time");
	      this.setSize(0, 0);
	      this.setVisible(false);
	      try {
         URL url = this.getClass().getClassLoader().getResource("gameover.wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         Clip clip = AudioSystem.getClip();
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      new DaTacoMood();
   }
}

