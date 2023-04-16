package main.demo;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class FilePlayer {

	public enum Tones {
		DO, RE, MI, FA, SOL, LA, SI, DO_OCTAVE;
	}

	synchronized public void syncPlay(Tones tone) {
		try {

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("res/" + tone.name() + ".wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			System.out.println(tone.name());

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}

	synchronized public void asyncPlay(Tones tone) {
		try {

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("res/" + tone.name() + ".wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			System.out.println(tone.name());
		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}
}
