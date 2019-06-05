package fr.consortnt.test.palindrome.checker.impl;

import fr.consortnt.test.palindrome.checker.PalindromeCheckerService;

public class PalindromeCheckerServiceImpl implements PalindromeCheckerService {

	public boolean isPalindrome(String str) {
		if(str == null || "".equals(str)) throw new IllegalArgumentException();
		
		boolean isPalindrome = true;
		for (int i = 0; i < (str.length() /2); i++) {
			int minPostion = i;
			int maxPosition = str.length() - 1 - i;
			if (Character.toLowerCase(str.charAt(minPostion)) != Character.toLowerCase(str.charAt(maxPosition))) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}

}
