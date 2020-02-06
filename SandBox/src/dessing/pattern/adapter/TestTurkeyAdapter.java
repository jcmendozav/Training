package dessing.pattern.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTurkeyAdapter {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		Duck perDuck = new PeruvianDock();
		
		Turkey perTurk =  new PeruvianTurkey();
		
		Duck adaptedTurk = new TurkeyAdapter(perTurk);
		
		
		processDuck(perDuck);
		processDuck(adaptedTurk);
		assertTrue(true);
	}

	private void processDuck(Duck duck) {
		// TODO Auto-generated method stub
		duck.quack();
	}

}
