package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {
	
	Janitor underTest = new Janitor("", "", true);
	
	@Test
	public void janitorShouldBeSweeping() {
		boolean isSweeping = underTest.isSweeping();
		assertThat(isSweeping, is(true));
	}
	
}
