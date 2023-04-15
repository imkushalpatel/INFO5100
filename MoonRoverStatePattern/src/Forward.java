public class Forward implements State {

	protected static int currentSpeed = 0;
	protected static final int maxSpeed = 100;

	public Forward() {

	}

	@Override
	public void pressRightPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {

	}

	@Override
	public void pressLeftPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {

	}

	@Override
	public String toString() {
		return Forward.class.getName();
	}

}