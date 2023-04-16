package main.demo;

import main.demo.FilePlayer.Tones;

public class Thread1 extends Thread {

	@Override
	public void run() {

		FilePlayer filePlayer = new FilePlayer();

		filePlayer.syncPlay(Tones.DO);

		filePlayer.syncPlay(Tones.MI);

		filePlayer.syncPlay(Tones.SOL);

		filePlayer.syncPlay(Tones.SI);

		filePlayer.asyncPlay(Tones.DO_OCTAVE);

	}
}
