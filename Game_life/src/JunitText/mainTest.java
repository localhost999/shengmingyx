package JunitText;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jiedui.main;

class mainTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testMainIntInt() {
		main star=new main(0,30);
		int s=0;
		assertEquals(s,star.gets());
		

	}

}
