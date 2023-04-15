public class AtRest implements State {

	public AtRest() {

	}

	@Override
	public void pressRightPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {

		switch (numOfTimesPressed) {
		case 0:
			switch (numOfSecondsPressed) {
			case 3:
				context.setState(new Backward());
				break;
			default:
				break;
			}
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
		return getClass().getName();
	}

}