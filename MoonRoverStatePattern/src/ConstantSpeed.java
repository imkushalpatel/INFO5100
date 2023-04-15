
public class ConstantSpeed extends Forward {
	public ConstantSpeed() {

	}

	@Override
	public void pressRightPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {
		switch (numOfTimesPressed) {
		case 0:
			switch (numOfSecondsPressed) {

			default:
				break;
			}
			break;
		case 1:
			context.setState(new Decelerate());
			break;
		default:
			break;
		}

	}

	@Override
	public void pressLeftPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {
		switch (numOfTimesPressed) {
		case 0:
			switch (numOfSecondsPressed) {
			default:
				break;
			}
			break;
		case 1:
			if (currentSpeed < maxSpeed) {
				context.setState(new Accelerate());
			}
			break;
		default:
			break;
		}

	}

	@Override
	public String toString() {
		return super.toString() + '.' + getClass().getName();
	}

}
