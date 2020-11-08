package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo1 {
	
	private static Exercises exercise;
	
	@BeforeAll
	public static void before() {
		exercise = new Exercises();
	}

	@Test
	public void foo1_10_10() {
		assertEquals(0.5F, exercise.foo1(10F, 10F));
	}
	
	@Test
	public void foo1_0_0_division_por_cero() {
		assertNotEquals(Float.NaN, exercise.foo1(0F, 0F));
	}
}
