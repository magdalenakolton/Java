package zad2;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Function2Test {
    @Test
    public void testIntegerWithMaxValue() {
        Function2 case1 = new Function2();
        List<Integer> list = List.of(-10, -9, -5, -1, 0, 1, 2, 4, 5, 100);
        assertEquals(3, Function2.solution(list));
    }

    @Test
    public void testOnlyPositiveValues() {
        Function2 case1 = new Function2();
        List<Integer> list = List.of(10, 9, 1, 2, 3, 4, 6);
        assertEquals(5, Function2.solution(list));
    }

    @Test
    public void testOnlyPositiveValues2() {
        Function2 case1 = new Function2();
        List<Integer> list = List.of(10, 9, 1, 2, 3, 4, 6);
        assertNotEquals(1, Function2.solution(list));
    }

    @Test
    public void testOnlyNegativeValues() {
        Function2 solution1 = new Function2();
        List<Integer> list = List.of(-10, -9, -5, -1, -555, -32);
        assertEquals(1, Function2.solution(list));
    }

    @Test
    public void testOnlyZeros() {
        Function2 case1 = new Function2();
        List<Integer> list = List.of(0, 0, 0, 0, 0, 0);
        assertEquals(1, Function2.solution(list));
    }

    @Test
    public void testNull() {
        Function2 case1 = new Function2();
        List<Integer> list = List.of();
        assertNotNull(Function2.solution(list));
    }

    @Test
    public void testNotNull() {
        Function2 case1 = new Function2();
        List<Integer> list = List.of(-10, -9, -5, -1, 0, 1, 2, 4, 5, 100);
        assertNotNull(Function2.solution(list));
    }

    @Test(timeout = 100)
    public void timeoutTest() {
        Function2 case1 = new Function2();
        List<Integer> list = List.of(-10, -9, -5, -1, 0, 1, 2, 4, 5, 100);
        assertEquals(3, Function2.solution(list));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRange(){
        Function2 case1 = new Function2();
        List<Integer> list = List.of(-1000000000, -9, -5, -1, 0, 1, 2, 4, 5, 100);
        Function2.solution(list);
    }
}