package zad5;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class SelectTest {

    @Test
    public void testHeapsort() {
        int[] rnd = new int[10];
        Random r = new Random();
        for (int i = 0; i < rnd.length; i++) { rnd[i] = r.nextInt(); }
        Select ob = new Select();
        ob.sort(rnd);
        Assert.assertTrue(rnd[1] <= rnd[2] && rnd[2] <= rnd[3]);

    }

    @Test (timeout = 1000)
    public void testHeapTime(){
        int[] rnd = new int[10];
        Random r = new Random();
        for (int i = 0; i < rnd.length; i++) { rnd[i] = r.nextInt(); }
        Select ob = new Select();
        ob.sort(rnd);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectSize(){
        int[] tab = new int[0];
        Select ob = new Select();
        ob.sort(tab);
    }



}