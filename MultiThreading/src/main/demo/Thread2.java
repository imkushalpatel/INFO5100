package main.demo;

import main.demo.FilePlayer.Tones;

public class Thread2 extends Thread {

	@Override
	public void run() {

		try {

			FilePlayer filePlayer = new FilePlayer();
			sleep(2000);
			filePlayer.syncPlay(Tones.RE);
			sleep(2000);
			filePlayer.syncPlay(Tones.FA);
			sleep(2000);
			filePlayer.syncPlay(Tones.LA);
			sleep(1000);
			filePlayer.asyncPlay(Tones.DO_OCTAVE);
			sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
