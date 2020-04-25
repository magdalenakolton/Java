import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import zad1.MatrixTest;
import zad2.Function2Test;
import zad3.Function3Test;
import zad4.Function4Test;
import zad5.*;

@RunWith(Suite.class)

@Suite.SuiteClasses(value = {

        Function2Test.class,
        Function3Test.class,
        Function4Test.class,
        BubbleSortTest.class,
        CocktailSortTest.class,
        HeapSortTest.class,
        InsertionSortTest.class,
        SelectTest.class,
        MatrixTest.class,
})

public class TestSuite {

}