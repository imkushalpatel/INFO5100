public class Rover {

	public Rover() {
	}

	public static void main(String[] args) {

		Context context = new Context();
		// At Rest
		System.out.println("1 " + context.getState());
		context.getState().pressLeftPedal(context, 1, 0); // Accelerate Speed 10
		System.out.println("2 " + context.getState());
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 20
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 30
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 40
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 50
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 60
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 70
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 80
		context.getState().pressRightPedal(context, 0, 3);// ConstantSpeed Speed 90
		System.out.println("3 " + context.getState());
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 90
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 100
		System.out.println("4 " + context.getState());
		context.getState().pressLeftPedal(context, 1, 0);// ConstantSpeed Speed 100
		System.out.println("5 " + context.getState());

		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 90
		System.out.println("6 " + context.getState());
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 80
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 70
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 60
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 50
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 40
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 30
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 20
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 10
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 0
		context.getState().pressRightPedal(context, 1, 0);// AtRest
		System.out.println("7 " + context.getState());

		context.getState().pressRightPedal(context, 0, 3);// Backward
		System.out.println("8 " + context.getState());
		context.getState().pressRightPedal(context, 1, 0);// AtRest
		System.out.println("9 " + context.getState());

	}
}