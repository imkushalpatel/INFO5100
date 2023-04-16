package main.demo.bonus;

import main.demo.bonus.FilePlayer.Tones;

public class Thread1 extends Thread {

	@Override
	public void run() {
		try {
			FilePlayer filePlayer = new FilePlayer();

			filePlayer.syncPlay(Tones.DO);
			sleep(1000);
			filePlayer.syncPlay(Tones.DO);
			sleep(1000);

			filePlayer.syncPlay(Tones.SOL);
			sleep(1000);
			filePlayer.syncPlay(Tones.SOL);
			sleep(3000);

			filePlayer.syncPlay(Tones.SOL);
			sleep(3000);

			filePlayer.syncPlay(Tones.MI);
			sleep(1000);
			filePlayer.syncPlay(Tones.MI);
			sleep(3000);

			filePlayer.syncPlay(Tones.DO);
			sleep(1000);
			filePlayer.syncPlay(Tones.SOL);
			sleep(1000);
			filePlayer.syncPlay(Tones.SOL);
			sleep(3000);

			filePlayer.syncPlay(Tones.MI);
			sleep(1000);
			filePlayer.syncPlay(Tones.MI);
			sleep(2000);

			filePlayer.syncPlay(Tones.SOL);
			sleep(1000);
			filePlayer.syncPlay(Tones.SOL);
			sleep(3000);

			filePlayer.syncPlay(Tones.MI);
			sleep(1000);
			filePlayer.syncPlay(Tones.MI);
			sleep(2000);

			filePlayer.syncPlay(Tones.DO);
			sleep(1000);
			filePlayer.syncPlay(Tones.DO);
			sleep(1000);

			filePlayer.syncPlay(Tones.SOL);
			sleep(1000);
			filePlayer.syncPlay(Tones.SOL);
			sleep(3000);

			filePlayer.syncPlay(Tones.SOL);
			sleep(3000);

			filePlayer.syncPlay(Tones.MI);
			sleep(1000);
			filePlayer.syncPlay(Tones.MI);
			sleep(3000);

			filePlayer.syncPlay(Tones.DO);
			sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
