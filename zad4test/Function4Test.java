package zad4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Function4Test {

    @Test
    public void testCorrectInput(){
        float[] array = {2,7,11,15};
        int result[] = {0,1};
        Assert.assertArrayEquals(result, Function4.solution(array, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectInputEquals(){
        float[] array = {};
        int result[] = {0,1};
        Assert.assertArrayEquals(result, Function4.solution(array, 9));
    }

    @Test
    public void testIncorrectResult() {
        float[] array = {2, 7, 11, 15};
        int result[] = Function4.solution(array, 9);
        int incorrect[] = {1,3};
        assertFalse(Arrays.equals(result, incorrect));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray(){
        float[] array = {};
        Assert.assertNull(Function4.solution(array, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoResult(){
        float[] array = {2};
        Assert.assertNull(Function4.solution(array, 2));
    }

    @Test(timeout = 100)
    public void testTimeout(){
        float[] array = {2,7,11,15};
        Function4.solution(array, 9);
    }

}