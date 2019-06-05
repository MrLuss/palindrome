package fr.consortnt.test.palindrome.checker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.consortnt.test.palindrome.checker.impl.PalindromeCheckerServiceImpl;
import junit.framework.Assert;

@RunWith(JUnit4.class)
public class PalindromeCheckerServiceTest {

	private PalindromeCheckerService palindromCheckerService;
	
	public PalindromeCheckerServiceTest() {
		this.palindromCheckerService = new PalindromeCheckerServiceImpl();
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionIfInputIsNull() {
		palindromCheckerService.isPalindrom(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionIfInputIsBlank() {
		palindromCheckerService.isPalindrom("");
	}
	
	@Test
	public void shouldReturnFalseIfInputIsNotAPalindrom() {
		Assert.assertFalse(palindromCheckerService.isPalindrom("iAmNotAPalimdrome"));
	}
	
	@Test
	public void shouldReturnTrueIsInputIsAPalindrom() {
		Assert.assertTrue(palindromCheckerService.isPalindrom("lEveL"));
		Assert.assertTrue(palindromCheckerService.isPalindrom("rEdDer"));		
	}
}
