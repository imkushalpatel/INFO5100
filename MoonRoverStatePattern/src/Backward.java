public class Backward implements State {

	public Backward() {

	}

	@Override
	public void pressLeftPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {
		context.setState(new AtRest());
	}

	@Override
	public void pressRightPedal(Context context, int numOfTimesPressed, int numOfSecondsPressed) {
		context.setState(new AtRest());
	}

	@Override
	public String toString() {
		return getClass().getName();
	}

}