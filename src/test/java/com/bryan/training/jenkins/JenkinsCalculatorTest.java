package com.bryan.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest {

	@Test
	public void addNumbersTest() {
		JenkinsCalculator jenkinsCalculator = new JenkinsCalculator();
		assertEquals(10, jenkinsCalculator.addNumbers(5, 5));
	}

	@Test
	public void subtractNumbersTest() {
		JenkinsCalculator jenkinsCalculator = new JenkinsCalculator();
		assertEquals(5, jenkinsCalculator.subtractNumbers(10, 5));
	}

}
