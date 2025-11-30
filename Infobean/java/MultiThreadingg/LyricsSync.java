import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class LyricsSync 
{

    public static void playSound(String filePath)
     {
        try {
            File file = new File(filePath);
            if (!file.exists()) 
                {
                System.out.println("Audio file not found!");
                return;
            }

            AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();

            // Wait until the audio completes
            clip.drain(); // ensures full play
            clip.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error while playing audio: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Lyrics of the song
        String lyrics = "Hum tere bin ab reh nahi sakte \n" +
                "Tere bina kya wajood meraaa . ...?\n " +
            
                "Tujhse juda gar ho jayenge \n" +
                "To khudse hi ho jayenge juda . .. . ! \n" +
                "Kyunki tum hi ho, ab tum hi ho \n" +
                "Zindagi, ";

        String[] words = lyrics.split(" ");

        // Provide the correct WAV file path
        String audioFilePath = "/home/tushar/VS code programing/Infobean/java/MultiThreadingg/_Tum_Hi_Ho_Ringtone_(by Fringster.com) (1).wav";

        // Thread to play the audio
        Thread playAudio = new Thread(() -> playSound(audioFilePath));
        playAudio.start();

        // Print lyrics word by word with delay
        try {
            for (String word : words) {
                System.out.print(word + " ");
                System.out.flush();
                Thread.sleep(800); // adjust timing as per song
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nThank Youuuu...");
    }
}
