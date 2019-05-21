package br.com.challenge.sysmanager.sysmanager_fibonacci;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testes unitários SysManager Fibonacci
 * @author kico
 *
 */
public class FibonacciTest {
	
	@Test
	public void passZeroShouldReturnZero() {
		assertTrue(Fibonacci.getFibonacci(0) == 0);
	}
	
	@Test
	public void passOneShouldReturnOne() {
		assertTrue(Fibonacci.getFibonacci(1) == 1);
	}
}
