package module1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEnumCard {

	@Test
	public void test() {
		EnumCardTest yas = new EnumCardTest(EnumCard.TWO_DIAMONDS);
		assertTrue(yas.isSuitDiamonds());
	}
}
