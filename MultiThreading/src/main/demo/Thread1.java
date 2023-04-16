package main.demo;

import main.demo.FilePlayer.Tones;

public class Thread1 extends Thread {

	@Override
	public void run() {
		try {
			FilePlayer filePlayer = new FilePlayer();

			filePlayer.syncPlay(Tones.DO);
			sleep(1000);
			filePlayer.syncPlay(Tones.MI);
			sleep(2000);
			filePlayer.syncPlay(Tones.SOL);
			sleep(2000);
			filePlayer.syncPlay(Tones.SI);
			sleep(2000);
			filePlayer.asyncPlay(Tones.DO_OCTAVE);
			sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
