import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome p=new Palindrome();
        boolean result = p.isPalindrome("moon");
        assertFalse(result);
        result =p.isPalindrome("monom");
        assertTrue(result);
        result = p.isPalindrome("Was it a car or a cat I saw");
        assertTrue(result);
    }
}