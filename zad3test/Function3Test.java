package zad3;

import org.junit.Assert;
import org.junit.Test;

public class Function3Test {

    @Test(expected = IllegalArgumentException.class)
    public void testEmptySubstrings(){
        Function3.substring("", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyFirstSubstring(){
        Function3.substring("", "dsadsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptySecondSubstring(){
        Function3.substring("dsadas", "");
    }

    @Test
    public void testCorrectEquals(){
        Assert.assertEquals(3, Function3.substring("abcd", "cdabcdabcd"));
    }

    @Test
    public void testCorrectNotEquals(){
        Assert.assertNotEquals(1, Function3.substring("abcd", "cdabcdabcd"));
    }

    @Test(timeout = 100)
    public void testTimeout(){
        Assert.assertEquals(3, Function3.substring("abcd", "cdabcdabcd"));
    }

}