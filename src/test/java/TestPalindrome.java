import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestPalindrome {

    @Test
    public void whenTrue() {
        Palindrome tes = new Palindrome();
        assertTrue(tes.isPalindrome("ini"));
    }

    @Test
    public void whenFalse() {
        Palindrome tes = new Palindrome();
        assertFalse(tes.isPalindrome("itu"));
    }
}
