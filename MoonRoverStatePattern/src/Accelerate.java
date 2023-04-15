
public class Accelerate extends Forward {

	public Accelerate() {
		currentSpeed += 10;
	}

	@Override
	public void pressRightPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {
		switch (numOfTimesPressed) {
		case 0:
			switch (numOfSecondsPressed) {
			case 3:
				context.setState(new ConstantSpeed());
				break;
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
			if (currentSpeed == maxSpeed) {
				context.setState(new ConstantSpeed());
				break;
			}
			currentSpeed += 10;
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
