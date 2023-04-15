
public class Decelerate extends Forward {
	public Decelerate() {
		currentSpeed -= 10;
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
			if (currentSpeed == 0) {
				context.setState(new AtRest());
				break;
			}
			currentSpeed -= 10;
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
			context.setState(new Accelerate());
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
