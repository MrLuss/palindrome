package fr.consortnt.test.palindrome.checker;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.consortnt.test.palindrome.checker.impl.PalindromeCheckerServiceImpl;

@RunWith(JUnit4.class)
public class PalindromeCheckerServiceTest {

	private PalindromeCheckerService palindromCheckerService;
	
	public PalindromeCheckerServiceTest() {
		this.palindromCheckerService = new PalindromeCheckerServiceImpl();
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionIfInputIsNull() {
		palindromCheckerService.isPalindrome(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionIfInputIsBlank() {
		palindromCheckerService.isPalindrome("");
	}
	
	@Test
	public void shouldReturnFalseIfInputIsNotAPalindrom() {
		Assert.assertFalse(palindromCheckerService.isPalindrome("iAmNotAPalimdrome"));
	}
	
	@Test
	public void shouldReturnTrueIsInputIsAPalindrom() {
		Assert.assertTrue(palindromCheckerService.isPalindrome("lEveL"));
		Assert.assertTrue(palindromCheckerService.isPalindrome("rEdDer"));		
	}
}
