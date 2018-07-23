import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayExecutorTest {
    int[] arr1 = {1, 2, 0, 0, 2, 3, 0, 1, 7};
    int[] arr2 = {1, 2, 4, 4, 2, 3, 5, 1, 7};
    int[] arr3 = {0, 0, 4, 4, 0, 0, 4, 0, 0};

    @Test
    public void executeFromArray1() {
        ArrayExecutor arrayExecutor = new ArrayExecutor();
        arrayExecutor.executeFromArray(arr3);
        List<Integer> res1 = new ArrayList<Integer>();
        res1.add(0);
        res1.add(0);
        assertEquals(res1, arrayExecutor.executeFromArray(arr3));
    }
    @Test
    public void executeFromArray2() {
        ArrayExecutor arrayExecutor = new ArrayExecutor();
        arrayExecutor.executeFromArray(arr2);
        List<Integer> res1 = new ArrayList<Integer>();
        res1.add(2);
        res1.add(3);
        res1.add(5);
        res1.add(1);
        res1.add(7);
        assertEquals(res1, arrayExecutor.executeFromArray(arr2));
    }

    //TODO как в тесте проверить вызов Runtimeexeption ???
    @Test
    public void executeFromArray3() {
        ArrayExecutor arrayExecutor = new ArrayExecutor();
        arrayExecutor.executeFromArray(arr1);
        List<Integer> res1 = new ArrayList<Integer>();
        res1.add(0);
        res1.add(0);
        assertEquals(res1, arrayExecutor.executeFromArray(arr1));
    }
}