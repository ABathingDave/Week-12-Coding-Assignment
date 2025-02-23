package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if (!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		}
		else {
			assertThatThrownBy(() -> { testDemo.addPositive(a, b);}).isInstanceOf(IllegalArgumentException.class);
		}
		public static Stream argumentsForAddPositive() {
			return Stream.of(arguments(2, 4, 6, false), arguments(4, 4, 8, false), arguments(0, -4, 0, true));
	}
		@Test
		void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
			assertThat(test.Demo.addPositive(4, 5)).isEqualTo(9);
			assertThat(test.Demo.addPositive(40, 50)).isEqualTo(90);
		}
		public static Stream2 argumentsForAddPositive2() {
			return Stream.of(arguments(2, 4, 6, false), arguments(4, 4, 8, false), arguments(0, -4, 0, true));
		}

}
