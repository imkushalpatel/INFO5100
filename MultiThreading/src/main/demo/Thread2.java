package main.demo;

import main.demo.FilePlayer.Tones;

public class Thread2 extends Thread {

	@Override
	public void run() {

		FilePlayer filePlayer = new FilePlayer();
		
		filePlayer.syncPlay(Tones.RE);

		filePlayer.syncPlay(Tones.FA);

		filePlayer.syncPlay(Tones.LA);

		filePlayer.asyncPlay(Tones.DO_OCTAVE);

	}

}
