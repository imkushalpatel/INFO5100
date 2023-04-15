import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoverTest {

	@Test
	void test() {
		
		Context context = new Context();
		// At Rest
		assertTrue(context.getState() instanceof AtRest);
		context.getState().pressLeftPedal(context, 1, 0); // Accelerate Speed 10
		assertTrue(context.getState() instanceof Forward);
		assertTrue(context.getState() instanceof Accelerate);
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 20
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 30
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 40
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 50
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 60
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 70
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 80
		context.getState().pressRightPedal(context, 0, 3);// ConstantSpeed Speed 90
		assertTrue(context.getState() instanceof Forward);
		assertTrue(context.getState() instanceof ConstantSpeed);
		assertFalse(context.getState() instanceof Accelerate);
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 90
		context.getState().pressLeftPedal(context, 1, 0);// Accelerate Speed 100
		assertTrue(context.getState() instanceof Forward);
		assertFalse(context.getState() instanceof ConstantSpeed);
		assertTrue(context.getState() instanceof Accelerate);
		context.getState().pressLeftPedal(context, 1, 0);// ConstantSpeed Speed 100
		assertTrue(context.getState() instanceof Forward);
		assertTrue(context.getState() instanceof ConstantSpeed);
		assertFalse(context.getState() instanceof Accelerate);
		context.getState().pressRightPedal(context, 1, 0);// Decelerate Speed 90
		assertTrue(context.getState() instanceof Forward);
		assertFalse(context.getState() instanceof ConstantSpeed);
		assertTrue(context.getState() instanceof Decelerate);
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
		assertFalse(context.getState() instanceof Forward);
		assertTrue(context.getState() instanceof AtRest);
		context.getState().pressRightPedal(context, 0, 3);// Backward
		assertFalse(context.getState() instanceof AtRest);
		assertTrue(context.getState() instanceof Backward);
		context.getState().pressRightPedal(context, 1, 0);// AtRest
		assertFalse(context.getState() instanceof Backward);
		assertTrue(context.getState() instanceof AtRest);
		

	}

}
