package main.demo.bonus;

import main.demo.bonus.FilePlayer.Tones;

public class Thread2 extends Thread {

	@Override
	public void run() {
		try {

			FilePlayer filePlayer = new FilePlayer();

			sleep(4000);

			filePlayer.syncPlay(Tones.LA);
			sleep(1000);
			filePlayer.syncPlay(Tones.LA);
			sleep(2000);

			filePlayer.syncPlay(Tones.FA);
			sleep(1000);
			filePlayer.syncPlay(Tones.FA);
			sleep(3000);

			filePlayer.syncPlay(Tones.RE);
			sleep(1000);
			filePlayer.syncPlay(Tones.RE);
			sleep(4000);

			filePlayer.syncPlay(Tones.FA);
			sleep(1000);
			filePlayer.syncPlay(Tones.FA);
			sleep(3000);

			filePlayer.syncPlay(Tones.RE);
			sleep(3000);

			filePlayer.syncPlay(Tones.FA);
			sleep(1000);
			filePlayer.syncPlay(Tones.FA);
			sleep(3000);

			filePlayer.syncPlay(Tones.RE);
			sleep(5000);

			filePlayer.syncPlay(Tones.LA);
			sleep(1000);
			filePlayer.syncPlay(Tones.LA);
			sleep(2000);

			filePlayer.syncPlay(Tones.FA);
			sleep(1000);
			filePlayer.syncPlay(Tones.FA);
			sleep(3000);

			filePlayer.syncPlay(Tones.RE);
			sleep(1000);
			filePlayer.syncPlay(Tones.RE);
			sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
